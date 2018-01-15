package com.zch.pattern.create.build;

public class ChinaAirShipDirector implements AirShipDirector {
	
	private AirShipBuilder builder;
	
	public ChinaAirShipDirector(AirShipBuilder build) {
		this.builder = build;
	}
	

	@Override
	public AirShip directAirShip() {
		Engine e = builder.buildEngine();
		OrbitalModule o = builder.buildOrbitalModule();
		EscapeTower et = builder.buildEscapeTower();
		
		AirShip airShip = new AirShip();
		airShip.setEngine(e);
		airShip.setEscapeTower(et);
		airShip.setOrbitalModule(o);
		return airShip;
	}

}
