package com.zch.pattern.create.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine crateEngin() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

}
