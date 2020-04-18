package org.easydarwin.util;

public class SIP {
    /**
     * SIP服务器地址
     */
    private String serverIp;
    /**
     * SIP服务器端口
     */
    private int serverPort;
    /**
     * SIP服务器ID
     */
    private String serverId;
    /**
     * SIP服务器域
     */
    private String serverDomain;
    /**
     * SIP用户名
     */
    private String deviceId;
    /**
     * SIP用户认证ID
     */
    private String channelId;
    /**
     * SIP用户认证密码
     */
    private String password;
    /**
     * 0:udp，1:tcp
     */
    private int protocol;
    /**
     * 注册有效期
     */
    private int regExpires;
    /**
     * 心跳周期
     */
    private int heartbeatInterval;
    /**
     * 最大心跳超时次数
     */
    private int heartbeatCount;

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerDomain() {
        return serverDomain;
    }

    public void setServerDomain(String serverDomain) {
        this.serverDomain = serverDomain;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public int getRegExpires() {
        return regExpires;
    }

    public void setRegExpires(int regExpires) {
        this.regExpires = regExpires;
    }

    public int getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public void setHeartbeatInterval(int heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    public int getHeartbeatCount() {
        return heartbeatCount;
    }

    public void setHeartbeatCount(int heartbeatCount) {
        this.heartbeatCount = heartbeatCount;
    }

    public enum ProtocolEnum {
        UDP(0),
        TCP(1);

        private int value;

        ProtocolEnum(int v) {
            this.value = v;
        }

        public int getValue() {
            return value;
        }
    }
}
