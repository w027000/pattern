package com.zch.pattern.structural.decorator;

/**
 * 
 * ���幦�ܵ��ֻ�
 */
public class ColorPhoneDecorator extends PhoneDecorator{

	public ColorPhoneDecorator(Phone phone) {
		super(phone);
	}
	
	@Override
	public void call(String name) {
		System.out.println("���Ų���");
		super.call(name);
	}

}
