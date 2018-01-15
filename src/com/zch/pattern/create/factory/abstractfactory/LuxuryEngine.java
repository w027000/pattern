package com.zch.pattern.create.factory.abstractfactory;

public class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("转的快");
	}

	@Override
	public void start() {
		System.out.println("可以自动起停");
	}

}
