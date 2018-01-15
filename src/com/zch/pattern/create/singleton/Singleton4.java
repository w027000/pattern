package com.zch.pattern.create.singleton;

/**
 * ��̬��ʵ�ַ�ʽ
 */
public class Singleton4 {
	
	private Singleton4() {
	}
	
	private static class Singleton4Instance{
		private static Singleton4 instance = new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return Singleton4Instance.instance;
	}
	
	
}
