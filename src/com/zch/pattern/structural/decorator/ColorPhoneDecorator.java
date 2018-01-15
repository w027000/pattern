package com.zch.pattern.structural.decorator;

/**
 * 
 * 彩铃功能的手机
 */
public class ColorPhoneDecorator extends PhoneDecorator{

	public ColorPhoneDecorator(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call(String name) {
		System.out.println("播放彩铃");
		super.call(name);
	}

}
