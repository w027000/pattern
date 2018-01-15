package com.zch.pattern.create.factory.methodfactory;

public class LincolnCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new LincolnCar();
	}

}
