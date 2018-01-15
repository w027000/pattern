package com.zch.pattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		Phone phone = new PhoneImpl();
		
		//��Ҫ������ֻ�
		new ColorPhoneDecorator(phone).call("tom");
		
		System.out.println("####################");
		
		//��Ҫ�����ֻ�
		new AdPhoneDecorator(phone).call("tom");
		
		System.out.println("######################");
		
		//��Ҫ�Ȳ��Ų����ֲ��Ź����ֻ�
		new ColorPhoneDecorator(new AdPhoneDecorator(phone)).call("tom");
	}

}
