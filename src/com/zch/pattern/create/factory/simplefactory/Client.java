package com.zch.pattern.create.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		
		Car lincoln = SimpleFactory.createCar("�ֿ�");
		lincoln.run();
		
		Car skodaCar = SimpleFactory.createCar("˹�´�");
		skodaCar.run();
		
		Car fordCar = SimpleFactory.createCar("����");
		fordCar.run();
		
	}

}
