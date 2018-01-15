package com.zch.pattern.create.singleton;

public class Client {

	public static void main(String[] args) {
		
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton11 = Singleton1.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton11);
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton22 = Singleton2.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton22);
		Singleton3 singleton3 = Singleton3.getInstance();
		Singleton3 singleton33 = Singleton3.getInstance();
		System.out.println(singleton3);
		System.out.println(singleton33);
		Singleton4 singleton4 = Singleton4.getInstance();
		Singleton4 singleton44 = Singleton4.getInstance();
		System.out.println(singleton4);
		System.out.println(singleton44);
		Singleton5 singleton5 = Singleton5.instance;
		Singleton5 singleton55 = Singleton5.instance;
		System.out.println(singleton5);
		System.out.println(singleton55);
		
	}

}
