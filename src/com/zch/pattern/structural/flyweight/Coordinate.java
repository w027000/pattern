package com.zch.pattern.structural.flyweight;

/**
 * 定义棋子的坐标类，不可以共享的~
 */
public class Coordinate {
	
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
