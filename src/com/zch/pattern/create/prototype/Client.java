package com.zch.pattern.create.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Date date = new Date(1231232L);
        Sheep s1 = new Sheep("少利",date);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println("s1--->" + s1);
        System.out.println("s1.getName()--->" + s1.getName());
        System.out.println("s1.getBirthday()--->" + s1.getBirthday());
        
        System.out.println("s2--->" + s2);
        System.out.println("s2.getName()--->" + s2.getName());
        System.out.println("s2.getBirthday()--->" + s2.getBirthday());
        
        
        System.out.println("修改date数据----------看看s1和s2什么情况");
        date.setTime(234324342423L);
        s1.setName("1111111111111111");
        System.out.println("s1--->" + s1);
        System.out.println("s1.getName()--->" + s1.getName());
        System.out.println("s1.getBirthday()--->" + s1.getBirthday());
        
        System.out.println("s2--->" + s2);
        System.out.println("s2.getName()--->" + s2.getName());
        System.out.println("s2.getBirthday()--->" + s2.getBirthday());
		
	}

}
