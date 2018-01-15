package com.zch.pattern.structural.bridge;

/**
 *   ����
 *
 */
public class Computer {
	
	private Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
	
	
}
