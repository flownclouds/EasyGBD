## EasyGBD ##

EasyGBD是[TSINGSEE青犀开放平台](http://open.tsingsee.com "TSINGSEE青犀开放平台")开发的一套客户端软件模拟IPC功能组件，可以注册到支持GB28181协议的服务器上，并且响应服务器发来的Invite指令进行实时流发送，其中视频源可以是本地文件、桌面、模拟相机等，全平台支持;


### 调用方法 ###

- **EasyGBD-Android**：Android安卓GB28181，采集安卓手机前/后摄像头、麦克风音视频注册到GB28181流媒体服务器；项目地址：[https://github.com/tsingsee/EasyGBD](https://github.com/tsingsee/EasyGBD)

<!--- **EasyGBD-iOS**：iOS苹果RTMP直播推流，采集苹果手机前/后摄像头、麦克风音视频注册到GB28181流媒体服务器；项目地址：[https://github.com/tsingsee/EasyGBD-iOS](https://github.com/tsingsee/EasyGBD-iOS "EasyGBD-iOS")
-->

> 我们在公网部署了一台演示的GB28181高性能流媒体服务器系统：[http://demo.easygbs.com](http://demo.easygbs.com "GB28181流媒体服务器") ，支持国标设备接入、级联、服务端录像、检索、回放等功能；


## 项目依赖

EasyGBD项目依赖1个TSINGSEE青犀开放平台的Git工程：

- Include：https://github.com/tsingsee/Include

目录结构为：

	/
	/Include/
	

### 编译方法 ###

	Windows平台采用Visual Studio 2010编译sln

	Linux下执行Builtit文件编译,具体如下：
	chmod +x Builtit
		
### 支持 ###

	Support GB28181 2016 version
	Support H264 PS package
	Support audio talk
	Support subscription, notification function
	Support recording playback
	Support recording download
	Support audio broadcast
	Support cross-platform compilation
	Small target file size
	Suitable for embedded device development

## 调用示例 ##

- EasyGBD Android：支持前/后摄像头直播、安卓屏幕直播

	[http://d.alphaqr.com/easygbd](http://d.alphaqr.com/easygbd "http://d.alphaqr.com/easygbd")

	<!--
	![EasyGBD Android](http://www.easydarwin.org/github/images/easyrtmpfirim20170409.png)
	-->

<!--
- EasyGBD iOS：支持前/后摄像头直播

	[https://itunes.apple.com/us/app/easyrtmp/id1222410811?mt=8](https://itunes.apple.com/us/app/easyrtmp/id1222410811?mt=8 "EasyGBD_iOS")

	![](http://www.easydarwin.org/github/images/easyrtmpios20170409.png)
-->

## 技术支持 ##

- 邮件：[support@tsingsee.com](mailto:support@tsingsee.com) 

- QQ交流群：<a href="https://jq.qq.com/?_wv=1027&k=e0ikkIIW" title="EasyGBD" target="_blank">**538316953**</a>

> EasyGBD是一款非常稳定的GB28181设备组件，各平台版本需要经过授权才能商业使用，商业授权方案可以通过以上渠道进行更深入的技术与合作咨询；


<br/>

### ✈ 更多视频解决方案资源汇总

- 流媒体技术：<br/>
© EasyDarwin开源流媒体服务器：<a href="http://www.easydarwin.org" target="_blank" title="EasyDarwin开源流媒体服务器">http://www.easydarwin.org</a><br/>
© TSINGSEE视频开放平台：<a href="http://open.tsingsee.com" target="_blank" title="TSINGSEE青犀视频开放平台">http://open.tsingsee.com</a><br/>

- 视频云服务：<br/>
© EasyDSS互联网视频云服务：<a href="http://www.easydss.com" target="_blank" title="EasyDSS互联网视频云服务">http://www.easydss.com</a><br/>
© EasyCVR安防视频云服务：<a href="http://www.easycvr.com" target="_blank" title="EasyCVR安防视频云服务">http://www.easycvr.com</a><br/>
© EasyGBS国标视频云服务：<a href="http://www.easygbs.com" target="_blank" title="EasyGBS国标视频云服务">http://www.easygbs.com</a><br/>
© EasyRTC在线视频会议平台：<a href="http://www.easyrtc.cn" target="_blank" title="EasyRTC在线视频会议平台">http://www.easyrtc.cn</a><br/>
© EasyRTS即时通信云服务：<a href="http://www.easyrts.com" target="_blank" title="EasyRTS即时通信云服务">http://www.easyrts.com</a><br/>

- 边缘计算：<br/>
© EasyNVR视频边缘计算网关：<a href="http://www.easynvr.com" target="_blank" title="EasyNVR视频边缘计算网关">http://www.easynvr.com</a><br/>
© EasyNTS上云网关：<a href="http://www.easynts.com" target="_blank" title="EasyNTS上云网关">http://www.easynts.com</a><br/>

© TSINGSEE Team：<a href="http://www.tsingsee.com" target="_blank" title="青犀TSINGSEE">http://www.tsingsee.com</a><br/>

![青犀TSINGSEE](http://www.easydarwin.org/public/images/tsingsee_qrcode_160.jpg)
