package com.zch.pattern.create.build;

public class ChinaAirShipBuild implements AirShipBuilder {

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("构建中国牌轨道舱！");
		return new OrbitalModule("中国牌轨道舱");
	}

	@Override
	public Engine buildEngine() {
		System.out.println("构建中国牌发动机！");
		return new Engine("中国牌发动机");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("构建中国牌逃逸塔！");
		return new EscapeTower("中国牌逃逸塔");
	}

}
