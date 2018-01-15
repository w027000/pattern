package com.zch.pattern.create.factory.simplefactory;

public class SimpleFactory {
	
	public static Car createCar(String carType) {
		Car car = null;
		if("福特".equals(carType)) {
			car = new FordCar();
		}else if("斯柯达".equals(carType)) {
			car = new SkodaCar();
		}else if("林肯".equals(carType)) {
			car = new LincolnCar();
		}
		return car;
	}
	
}
