package com.zch.pattern.create.factory.methodfactory;


public class Client {

	public static void main(String[] args) {
		
		Car lincoln = new LincolnCarFactory().createCar();
		lincoln.run();
		
		Car skodaCar = new SkodaCarFactory().createCar();
		skodaCar.run();
		
		Car fordCar = new FordCarFactory().createCar();
		fordCar.run();
		
	}

}
