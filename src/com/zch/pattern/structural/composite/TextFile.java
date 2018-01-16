package com.zch.pattern.structural.composite;

public class TextFile implements AbstractFile{
	
	private String fileName;
	
	public TextFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void killVirus() {
		System.out.println("对文本文件" + fileName + ",进行查杀！");
	}

}
