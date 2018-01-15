package com.zch.pattern.create.singleton;

/**
 * Ë«ÖØ¼ì²âËøÄ£Ê½
 */
public class Singleton3 {
	
	private static Singleton3 instance;
	
	private Singleton3() {
	}
	
	public static Singleton3 getInstance() {
		if(instance == null) {
			synchronized (Singleton3.class) {
				Singleton3 s = instance;
				if(s == null) {
					synchronized (Singleton3.class) {
						s = new Singleton3();
					}
				}
				instance = s;
			}
		}
		return instance;
	}
	
}
