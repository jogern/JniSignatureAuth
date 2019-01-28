# JniSignatureAuth

#### 一.在rootproject的build.gradle中增加

~~~
allprojects {
		repositories {
			//增加
			maven { url 'https://jitpack.io' }
		}
	}
~~~
在app中的build.gradle

~~~
 implementation 'com.github.jogern:JniSignatureAuth:v1.0.2'
~~~

#### 二.使用

1.实现对字符串进行md5
	
~~~
String md5 = AuthLib.md5("")；
~~~

2.实现根据签名信息对字符串加解密

```
apk中有一些常量不想让人直接看到
如：网址的url，配置的key，...
所进行字符串加密

a.先初始化签名
	AuthLib.initSignature(context);
b.进行加密（配置release签名）
	
	//对字符串加密
	String encrypt = AuthLib.encrypt("123456");

c.对字符串进行解密
	
	String decrypt = AuthLib.decrypt(encrypt)

```

#### 三.增加混淆

~~~
-keep class com.jogern.jniauth.** { *;}
~~~



