package com.zch.pattern.create.build;

public class ChinaAirShipBuild implements AirShipBuilder {

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("�����й��ƹ���գ�");
		return new OrbitalModule("�й��ƹ����");
	}

	@Override
	public Engine buildEngine() {
		System.out.println("�����й��Ʒ�������");
		return new Engine("�й��Ʒ�����");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("�����й�����������");
		return new EscapeTower("�й���������");
	}

}
