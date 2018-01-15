package com.zch.pattern.create.singleton;

/**
 *  ����ʽ
 */
public class Singleton1 {
	
	private static final Singleton1 instance = new Singleton1();
	
	private Singleton1() {
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
}
