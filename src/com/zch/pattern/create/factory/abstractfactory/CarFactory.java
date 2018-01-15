package com.zch.pattern.create.factory.abstractfactory;

public interface CarFactory {
	
	Engine crateEngin();
	Seat createSeat();
	Tyre createTyre();
	
}
