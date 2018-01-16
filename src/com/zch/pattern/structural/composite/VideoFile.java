package com.zch.pattern.structural.composite;

public class VideoFile implements AbstractFile{
	
	private String fileName;
	
	public VideoFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void killVirus() {
		System.out.println("����Ƶ�ļ�" + fileName + ",���в�ɱ��");
	}

}
