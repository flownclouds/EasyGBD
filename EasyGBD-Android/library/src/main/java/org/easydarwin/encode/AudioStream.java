package org.easydarwin.encode;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Process;
import android.util.Log;

import com.easygbs.Device;

import org.easydarwin.muxer.EasyMuxer;
import org.easydarwin.push.Pusher;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * AudioRecord音频采集
 * */
public class AudioStream {
    private static final String TAG = AudioStream.class.getSimpleName();

    private static AudioStream _this;

    private final Context context;

    private int samplingRate = 8000;
    private boolean enableAudio;

    AudioRecord mAudioRecord;   // 底层的音频采集

    private Thread mThread = null;

    Set<Pusher> sets = new HashSet<>();

    public static synchronized AudioStream getInstance(Context context) {
        if (_this == null)
            _this = new AudioStream(context);

        return _this;
    }

    public AudioStream(Context context) {
        this.context = context;
    }

    /*
    * 添加推流器
    * */
    public void addPusher(Pusher pusher) {
        boolean shouldStart = false;

        synchronized (this) {
            if (sets.isEmpty()) {
                shouldStart = true;
            }

            if (pusher != null) {
                pusher.setAFormat(Device.AUDIO_CODEC_G711U, samplingRate, 1, 16);
            }

            sets.add(pusher);
        }

        if (shouldStart)
            startRecord();
    }

    /*
    * 删除推流器
    * */
    public void removePusher(Pusher pusher){
        boolean shouldStop = false;

        synchronized (this) {
            sets.remove(pusher);

            if (sets.isEmpty())
                shouldStop = true;
        }

        if (shouldStop)
            stop();
    }

    public synchronized void setMuxer(EasyMuxer muxer) {

    }

    /**
     * 编码
     */
    private void startRecord() {
        if (mThread != null)
            return;

        /**
         * 3、开启一个子线程，不断从AudioRecord的缓冲区将音频数据读出来。
         * 注意，这个过程一定要及时，否则就会出现“overrun”的错误，
         * 该错误在音频开发中比较常见，意味着应用层没有及时地取走音频数据，导致内部的音频缓冲区溢出。
         * */
        mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Process.setThreadPriority(Process.THREAD_PRIORITY_AUDIO);
                int len, bufferIndex;

                try {
                    // 计算bufferSizeInBytes：int size = 采样率 x 位宽 x 通道数
                    int bufferSize = AudioRecord.getMinBufferSize(samplingRate,
                            AudioFormat.CHANNEL_IN_MONO,
                            AudioFormat.ENCODING_PCM_16BIT);

                    /*
                     * 1、配置参数，初始化AudioRecord构造函数
                     * audioSource：音频采集的输入源，DEFAULT（默认），VOICE_RECOGNITION（用于语音识别，等同于DEFAULT），MIC（由手机麦克风输入），VOICE_COMMUNICATION（用于VoIP应用）等等
                     * sampleRateInHz：采样率，注意，目前44.1kHz是唯一可以保证兼容所有Android手机的采样率。
                     * channelConfig：通道数的配置，CHANNEL_IN_MONO（单通道），CHANNEL_IN_STEREO（双通道）
                     * audioFormat：配置“数据位宽”的,ENCODING_PCM_16BIT（16bit），ENCODING_PCM_8BIT（8bit）
                     * bufferSizeInBytes：配置的是 AudioRecord 内部的音频缓冲区的大小，该缓冲区的值不能低于一帧“音频帧”（Frame）的大小
                     * */
                    mAudioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
                            samplingRate,
                            AudioFormat.CHANNEL_IN_MONO,
                            AudioFormat.ENCODING_PCM_16BIT,
                            bufferSize);

                    // 2、开始采集
                    mAudioRecord.startRecording();

                    while (mThread != null) {
                        byte[] bytes = new byte[bufferSize];
                        len = mAudioRecord.read(bytes, 0, bytes.length);
                        Log.i("AAA", "len：" + len);

                        Collection<Pusher> p;
                        synchronized (AudioStream.this) {
                            p = sets;
                        }
                        Iterator<Pusher> it = p.iterator();
                        // 推流
                        while (it.hasNext()) {
                            Pusher ps = it.next();
                            ps.pushA(bytes, bytes.length, samplingRate);
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Record___Error!!!!!");
                    e.printStackTrace();
                } finally {
                    // 4、停止采集，释放资源。
                    if (mAudioRecord != null) {
                        mAudioRecord.stop();
                        mAudioRecord.release();
                        mAudioRecord = null;
                    }
                }
            }
        }, "AACRecoder");

        if (enableAudio) {
            mThread.start();
        }
    }

    private void stop() {
        try {
            Thread t = mThread;
            mThread = null;

            if (t != null) {
                t.interrupt();
                t.join();
            }
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }

    public void setEnableAudio(boolean enableAudio) {
        this.enableAudio = enableAudio;
    }
}
