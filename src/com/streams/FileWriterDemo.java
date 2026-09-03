package com.streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args)  {
		File f=new File("myfile.txt");
		try (FileWriter fw=new FileWriter(f)){
			fw.write("India is my country");
			fw.write("\nI love my country");
			
			char[] charArray= {'a','e','i','o','u'};
			fw.write("\n");
			fw.write(charArray);
			
			fw.flush();
		} catch (IOException e) {	
			System.out.println("Please make sure the file exists");
			e.printStackTrace();
		}


	}

}
