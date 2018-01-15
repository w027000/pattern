package com.zch.pattern.create.build;

public class Client {

	public static void main(String[] args) {
		
		AirShipDirector  airShipDirector = new ChinaAirShipDirector(new ChinaAirShipBuild());
		AirShip airShip = airShipDirector.directAirShip();
		airShip.launch();
	}

}
