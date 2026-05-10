package com.javatutorials.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadermethod {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileReader f = new FileReader(file);
		int asciiCode;
		String text =" ";
		while((asciiCode = f.read())!=-1) {
			text+=String.valueOf((char)asciiCode);
			System.out.print((char)asciiCode);
			
		}
//		System.out.println();
		System.out.println(text);
		
		
		f.close();
		}
	}


