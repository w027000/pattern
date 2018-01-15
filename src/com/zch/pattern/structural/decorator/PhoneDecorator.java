package com.zch.pattern.structural.decorator;
/**
 * 虚拟电话通话装饰类
 */
public abstract class PhoneDecorator implements Phone{
	
	private Phone phone;

	public PhoneDecorator(Phone phone) {
		super();
		this.phone = phone;
	}
	
	@Override
	public void call(String name) {
		phone.call(name);
	}
	
}
