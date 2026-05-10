package com.javatutorials.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMethod {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileReader fr = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String text =" ";
		 String line =" ";
		 while((line = br.readLine())!=null) {
			 System.out.println(line);
			 
		 }
			fr.close();
			isr.close();
			br.close();
	}

}
