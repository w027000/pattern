package com.zch.pattern.structural.composite;

public class ImageFile implements AbstractFile{
	
	private String fileName;
	
	public ImageFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void killVirus() {
		System.out.println("对图像文件" + fileName + ",进行查杀！");
	}

}
