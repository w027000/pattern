package com.zch.pattern.structural.bridge;

public class Client {

	public static void main(String[] args) {
		
		//��������ʼǱ�
		new LaptopComputer(new LenovoBrand()).sale();
		System.out.println("##########################");
		//���۴���̨ʽ��
		new DesktopComputer(new DellBrand()).sale();
	}

}
