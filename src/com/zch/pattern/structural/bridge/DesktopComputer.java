package com.zch.pattern.structural.bridge;

public class DesktopComputer extends Computer{

	public DesktopComputer(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("����̨ʽ��");
	}

}
