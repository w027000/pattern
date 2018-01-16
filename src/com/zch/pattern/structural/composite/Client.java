package com.zch.pattern.structural.composite;

public class Client {

	public static void main(String[] args) {

		Folder folder = new Folder("我的目录");
		folder.addFile(new ImageFile("图片目录"));
		folder.addFile(new TextFile("文件"));
		folder.killVirus();

	}

}
