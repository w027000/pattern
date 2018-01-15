package com.zch.pattern.structural.decorator;

public class AdPhoneDecorator extends PhoneDecorator{

	public AdPhoneDecorator(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call(String name) {
		super.call(name);
		System.out.println("²¥·Å¹ã¸æ");
	}

}
