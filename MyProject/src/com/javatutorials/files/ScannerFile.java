package com.javatutorials.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner =new Scanner(fis);
		String text =" ";
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			
		}
		while(scanner.hasNextLine()) {
			text+=scanner.nextLine()+"\n";
			System.out.println(scanner.nextLine());
		}
		
scanner.close();
fis.close();
	}

}
