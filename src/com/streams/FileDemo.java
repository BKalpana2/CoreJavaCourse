package com.streams;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args)  {
	File file=new File("jfs57.txt");
	try {
	file.createNewFile();
	System.out.println("Does the file exist ? :"+file.exists());
	File dir=new File("jfs57directory");
	dir.mkdir();
	System.out.println("Does the directory exist ? :"+dir.exists());
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
