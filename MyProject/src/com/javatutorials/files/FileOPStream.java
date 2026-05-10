package com.javatutorials.files;
import java.io.*;

public class FileOPStream {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
		file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		String s ="Hey hi guys how are you ";
		for(char ch:s.toCharArray()) {
			fos.write((int)ch);
		}
		fos.close();
		fos.flush();
		
		
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
		
		// There are different ways to write data on file i.e write 
		// with ASCII code , write  data with creating a string . we used both ways to create.
	
		 
	}
}
