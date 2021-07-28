package com.easygbs.device;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.res.AssetManager;
import android.os.Build;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.easygbs.Device.getActiveDays;
import static com.easygbs.Device.activate;

public class EasyApplication extends Application {

    public static final String CHANNEL_CAMERA = "camera";

    private static EasyApplication mApplication;
    public static int activeDays = 9999;

    public static EasyApplication getEasyApplication() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = this;

        File youyuan = getFileStreamPath("SIMYOU.ttf");
        if (!youyuan.exists()) {
            AssetManager am = getAssets();

            try {
                InputStream is = am.open("zk/SIMYOU.ttf");
                FileOutputStream os = openFileOutput("SIMYOU.ttf", MODE_PRIVATE);
                byte[] buffer = new byte[1024];
                int len;

                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }

                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String key = "754C3273753536526D343241654C56676E3071484A65316A623230755A57467A655764696379356B5A585A7059325570567778576F502B6C2F69426C59584E35";
        activate(key, this);
        activeDays = getActiveDays(this, key);

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.camera);

            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_CAMERA, name, importance);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
