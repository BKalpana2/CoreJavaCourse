package com.streams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try(FileReader r=new FileReader("myfile.txt")){
			System.out.println("Reading the contents of myfile.txt");
			int character;
			while((character= r.read())!=-1) {
				System.out.print((char)character);
				
			}
		}catch(IOException e) {

	}

}
}
