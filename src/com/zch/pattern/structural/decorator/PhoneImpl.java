package com.zch.pattern.structural.decorator;

/**
 * 
 *  �����ֻ�ͨ���Ĺ���
 */
public class PhoneImpl implements Phone{
	
	//��绰
	@Override
	public void call(String name) {
		System.out.println(name + "����ͨ����");
	}

}
