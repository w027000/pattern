package com.zch.pattern.structural.facade;

public class Disk implements ComputerComponent{
	
	@Override
	public void start() {
		System.out.println("Disk is start... ");
	}

	@Override
	public void shutDown() {
		System.out.println("Disk is shutDown... ");
	}
}
