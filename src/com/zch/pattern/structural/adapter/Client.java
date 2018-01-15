package com.zch.pattern.structural.adapter;

public class Client {

	public static void main(String[] args) {
		
		Adapter adapter = new Adapter(new Adaptee());
		adapter.handleReq();
		
	}

}
