package com.zch.pattern.create.factory.abstractfactory;

public class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת����");
	}

	@Override
	public void start() {
		System.out.println("�������Զ���ͣ");
	}

}
