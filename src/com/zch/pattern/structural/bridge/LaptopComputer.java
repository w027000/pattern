package com.zch.pattern.structural.bridge;

public class LaptopComputer extends Computer{

	public LaptopComputer(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("���۱ʼǱ�");
	}

}
