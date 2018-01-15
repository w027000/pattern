package com.zch.pattern.create.factory.methodfactory;

public class FordCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new FordCar();
	}

}
