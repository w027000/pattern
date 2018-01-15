package com.zch.pattern.create.factory.methodfactory;

public class SkodaCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new SkodaCar();
	}

}
