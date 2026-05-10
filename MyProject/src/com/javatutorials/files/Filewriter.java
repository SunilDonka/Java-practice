package com.javatutorials.files;

import java.io.*;

public class Filewriter {
	public static void main(String[] args) throws IOException{
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		String s ="hello world";
		FileWriter fw = new FileWriter(file);
		fw.write(s);
		fw.flush();
		fw.close();
	
	}

}
