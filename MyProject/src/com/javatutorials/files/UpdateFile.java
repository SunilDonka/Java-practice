package com.javatutorials.files;

import java.io.*;

public class UpdateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		String existingText = " ";
		String line=" ";
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		 while((line = br.readLine())!=null)
			 existingText += line+"\n";
			 String s ="how are you doing?";
			 
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(existingText+s);
			bw.flush();
			bw.close();
			
			
			
			
	}

}
