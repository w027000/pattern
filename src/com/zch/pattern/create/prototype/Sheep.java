package com.zch.pattern.create.prototype;

import java.util.Date;

public class Sheep implements Cloneable{

	private String name;
	private Date birthday;
	
	public Sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Sheep sheep = (Sheep) obj;
		sheep.birthday = (Date) this.birthday.clone();
		return obj;
	}
}
