package com.streams;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		try(BufferedWriter b=new BufferedWriter(new FileWriter("output.txt")) ){
			b.write("hello codegnan");
			b.newLine();
			b.write("Buffered writer is faster for large text files");
			b.flush();
			System.out.println("Date is written successfully to output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
