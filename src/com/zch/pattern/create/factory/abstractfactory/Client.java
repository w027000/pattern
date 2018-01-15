package com.zch.pattern.create.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		//�߶�����
		CarFactory luxuryCar= new LuxuryCarFactory();
		Engine luxengine = luxuryCar.crateEngin();
		Seat luxseat = luxuryCar.createSeat();
		Tyre luxtyre = luxuryCar.createTyre();
		luxengine.run();
		luxengine.start();
		luxseat.message();
		luxtyre.revolve();
		
		System.out.println("####################");
		
		//�Ͷ�����
		CarFactory lowCar = new LowCarFactory();
		Engine lowengine = lowCar.crateEngin();
		Seat lowseat = lowCar.createSeat();
		Tyre lowtyre = lowCar.createTyre();
		lowengine.run();
		lowengine.start();
		lowseat.message();
		lowtyre.revolve();
		
	}

}
