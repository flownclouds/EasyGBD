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

- 邮件：[support@easydarwin.org](mailto:support@easydarwin.org) 

- QQ交流群：<a href="https://jq.qq.com/?_wv=1027&k=5dkmdix" title="EasyGBD" target="_blank">**538316953**</a>

> EasyGBD是一款非常稳定的GB28181设备组件，各平台版本需要经过授权才能商业使用，商业授权方案可以通过以上渠道进行更深入的技术与合作咨询；


## 更多流媒体音视频资源

EasyDarwin开源流媒体服务器：<a href="http://www.easydarwin.org" target="_blank" title="EasyDarwin开源流媒体服务器">www.EasyDarwin.org</a>

EasyDSS高性能互联网直播服务：<a href="http://www.easydss.com" target="_blank" title="EasyDSS高性能互联网直播服务">www.EasyDSS.com</a>

EasyNVR安防视频可视化服务：<a href="http://www.easynvr.com" target="_blank" title="EasyNVR安防视频可视化服务">www.EasyNVR.com</a>

EasyNVS视频综合管理平台：<a href="http://www.easynvs.com" target="_blank" title="EasyNVS视频综合管理平台">www.EasyNVS.com</a>

EasyNTS云组网：<a href="http://www.easynts.com" target="_blank" title="EasyNTS云组网">www.EasyNTS.com</a>

EasyGBS国标GB/T28181服务器：<a href="http://www.easygbs.com" target="_blank" title="EasyGBS国标GB/T28181视频服务器">www.EasyGBS.com</a>

EasyRTS应急指挥平台：<a href="http://www.easyrts.com" target="_blank" title="EasyRTS应急指挥平台">www.EasyRTS.com</a>

TSINGSEE青犀开放平台：<a href="http://open.tsingsee.com" target="_blank" title="TSINGSEE青犀开放平台">open.TSINGSEE.com</a>

Copyright © <a href="http://www.tsingsee.com" target="_blank" title="青犀TSINGSEE">www.TSINGSEE.com</a> Team 2012-2019

![青犀TSINGSEE](http://www.easydarwin.org/public/images/tsingsee_qrcode_160.jpg)
