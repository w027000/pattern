package com.zch.pattern.structural.composite;

public class Client {

	public static void main(String[] args) {

		Folder folder = new Folder("�ҵ�Ŀ¼");
		folder.addFile(new ImageFile("ͼƬĿ¼"));
		folder.addFile(new TextFile("�ļ�"));
		folder.killVirus();

	}

}
