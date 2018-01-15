package com.zch.pattern.structural.adapter;

/**
 * 需要被适配的类
 * （相当于列子中的ps/2键盘）
 */
public class Adaptee {
	
	public void request() {
		System.out.println("可以完成客户请求的功能!");
	}
	
}
