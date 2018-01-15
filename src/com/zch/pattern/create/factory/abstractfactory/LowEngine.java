package com.zch.pattern.create.factory.abstractfactory;

public class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("转的慢");
	}

	@Override
	public void start() {
		System.out.println("不可以自动起停");
	}

}
