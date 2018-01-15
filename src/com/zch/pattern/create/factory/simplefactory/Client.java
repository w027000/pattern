package com.zch.pattern.create.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		
		Car lincoln = SimpleFactory.createCar("林肯");
		lincoln.run();
		
		Car skodaCar = SimpleFactory.createCar("斯柯达");
		skodaCar.run();
		
		Car fordCar = SimpleFactory.createCar("福特");
		fordCar.run();
		
	}

}
