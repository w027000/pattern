package com.zch.pattern.structural.facade;

/**
 * √≈√Ê¿‡  
 */
public class Computer {
	
	public void start() {
		new CPU().start();
		new Disk().start();
		new Memory().start();
	}
	
	
	public void shutDown() {
		new CPU().shutDown();
		new Disk().shutDown();
		new Memory().shutDown();
	}
	

}
