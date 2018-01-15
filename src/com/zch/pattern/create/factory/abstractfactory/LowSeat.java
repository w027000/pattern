package com.zch.pattern.create.factory.abstractfactory;

public class LowSeat implements Seat{

	@Override
	public void message() {
		System.out.println("不可以按摩");
	}

}
