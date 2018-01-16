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
		System.out.println("棋子的颜色是：" + color);
		System.out.println("棋子的坐标是：x=" + coordinate.getX() + ",y=" + coordinate.getY());
	}

}
