package com.zch.pattern.create.factory.simplefactory;

public class SimpleFactory {
	
	public static Car createCar(String carType) {
		Car car = null;
		if("����".equals(carType)) {
			car = new FordCar();
		}else if("˹�´�".equals(carType)) {
			car = new SkodaCar();
		}else if("�ֿ�".equals(carType)) {
			car = new LincolnCar();
		}
		return car;
	}
	
}
