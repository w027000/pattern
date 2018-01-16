package com.zch.pattern.structural.flyweight;

public class ConcreteChess implements Chess{
	
	private String color;
	
	public ConcreteChess(String color) {
		this.color = color;
	}
	

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("���ӵ���ɫ�ǣ�" + color);
		System.out.println("���ӵ������ǣ�x=" + coordinate.getX() + ",y=" + coordinate.getY());
	}

}
