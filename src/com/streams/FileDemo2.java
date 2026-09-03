package com.streams;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
	//create a directory
		File dir=new File("mynotes");
		dir.mkdir();
		
		File f1=new File(dir,"arrays.txt");
		
		try {
		f1.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		File dir2=new File("javaprograms");
		dir2.mkdir();
		File f2=new File(dir2,"operators.txt");
		try {
			f2.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		File f3=new File(dir,"controlflow.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String []name=dir.list();
		for(String names:name) {
			System.out.println(names);
		}
	}
}
