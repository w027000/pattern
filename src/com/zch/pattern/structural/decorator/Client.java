package com.zch.pattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		Phone phone = new PhoneImpl();
		
		//需要彩铃的手机
		new ColorPhoneDecorator(phone).call("tom");
		
		System.out.println("####################");
		
		//需要广告的手机
		new AdPhoneDecorator(phone).call("tom");
		
		System.out.println("######################");
		
		//需要既播放彩铃又播放广告的手机
		new ColorPhoneDecorator(new AdPhoneDecorator(phone)).call("tom");
	}

}
