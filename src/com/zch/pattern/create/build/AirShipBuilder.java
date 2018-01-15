package com.zch.pattern.create.build;

public interface AirShipBuilder {
	
	OrbitalModule buildOrbitalModule();
    Engine buildEngine();
    EscapeTower buildEscapeTower();
    
}
