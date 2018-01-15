package com.zch.pattern.structural.bridge;

public class LenovoBrand implements Brand{

	@Override
	public void sale() {
		System.out.println("销售联想品牌电脑");
	}

}
