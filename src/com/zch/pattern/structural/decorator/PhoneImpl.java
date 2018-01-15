package com.zch.pattern.structural.decorator;

/**
 * 
 *  具体手机通话的功能
 */
public class PhoneImpl implements Phone{
	
	//打电话
	@Override
	public void call(String name) {
		System.out.println(name + "正在通话中");
	}

}
