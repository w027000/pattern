package com.zch.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {

	private String folderName;
	// ����������������ű����������µ��ӽڵ�
	private List<AbstractFile> list = new ArrayList<>();

	public Folder(String folderName) {
		super();
		this.folderName = folderName;
	}

	public void addFile(AbstractFile abstractFile) {
		list.add(abstractFile);
	}

	public void removeFile(AbstractFile abstractFile) {
		list.remove(abstractFile);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("---�ļ��У�" + folderName + ",���в�ɱ");
		
		for(AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}
	}

}
