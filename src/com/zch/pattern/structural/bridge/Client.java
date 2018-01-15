package com.zch.pattern.structural.bridge;

public class Client {

	public static void main(String[] args) {
		
		//销售联想笔记本
		new LaptopComputer(new LenovoBrand()).sale();
		System.out.println("##########################");
		//销售戴尔台式机
		new DesktopComputer(new DellBrand()).sale();
	}

}
