package com.zch.pattern.structural.facade;

public class CPU implements ComputerComponent{
	
	@Override
	public void start() {
		System.out.println("CPU is start... ");
	}
	
	@Override
	public void shutDown() {
		System.out.println("CPU is shutDown... ");
	}
	
}
