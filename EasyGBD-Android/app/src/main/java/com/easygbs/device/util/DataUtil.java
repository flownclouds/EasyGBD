package com.easygbs.device.util;

import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;

import com.easygbs.device.EasyApplication;

import org.easydarwin.util.SIP;

public class DataUtil {

    public static void setSIP(SIP sip) {
        PreferenceManager.getDefaultSharedPreferences(EasyApplication.getEasyApplication())
                .edit()
                .putString("serverIp", sip.getServerIp())
                .putInt("serverPort", sip.getServerPort())
                .putString("serverId", sip.getServerId())
                .putString("serverDomain", sip.getServerDomain())
                .putString("deviceId", sip.getDeviceId())
                .putString("channelId", sip.getChannelId())
                .putString("password", sip.getPassword())
                .putInt("protocol", sip.getProtocol())
                .putInt("regExpires", sip.getRegExpires())
                .putInt("heartbeatInterval", sip.getHeartbeatInterval())
                .putInt("heartbeatCount", sip.getHeartbeatCount())
                .apply();
    }

    public static SIP getSIP() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(EasyApplication.getEasyApplication());

        SIP sip = new SIP();
        sip.setServerIp(sp.getString("serverIp", "demo.easygbs.com"));
        sip.setServerPort(sp.getInt("serverPort", 15060));
        sip.setServerId(sp.getString("serverId", "34020000002000000001"));
        sip.setServerDomain(sp.getString("serverDomain", "3402000000"));
        sip.setDeviceId(sp.getString("deviceId", "34020000001110005555"));
        sip.setChannelId(sp.getString("channelId", "34020000001310005555"));
        sip.setPassword(sp.getString("password", "23456789"));
        sip.setProtocol(sp.getInt("protocol", 0));
        sip.setRegExpires(sp.getInt("regExpires", 3600));
        sip.setHeartbeatInterval(sp.getInt("heartbeatInterval", 30));
        sip.setHeartbeatCount(sp.getInt("heartbeatCount", 3));

        return sip;
    }

    public static String recordPath() {
        return Environment.getExternalStorageDirectory() +"/EasyGBS";
    }
}
