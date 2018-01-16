package com.zch.pattern.structural.facade;

public class Memory implements ComputerComponent{

	@Override
	public void start() {
		System.out.println("Memory is start... ");
	}

	@Override
	public void shutDown() {
		System.out.println("Memory is shutDown... ");
	}

}
