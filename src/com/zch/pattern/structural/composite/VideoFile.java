package com.zch.pattern.structural.composite;

public class VideoFile implements AbstractFile{
	
	private String fileName;
	
	public VideoFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void killVirus() {
		System.out.println("对视频文件" + fileName + ",进行查杀！");
	}

}
