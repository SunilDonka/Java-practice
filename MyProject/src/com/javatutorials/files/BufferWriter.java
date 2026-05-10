package com.javatutorials.files;

import java.io.*;


public class BufferWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		String s ="hello sunil";
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(s);
		bw.close();
		
		

	}

}
