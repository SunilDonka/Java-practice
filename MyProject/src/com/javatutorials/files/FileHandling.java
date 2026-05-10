package com.javatutorials.files;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sunil Donka\\Documents\\TestFiles\\resume.txt");
		
//		if(f.exists()){
//			f.delete();
//			System.out.println(f.createNewFile());
//		}
		System.out.println(f.isHidden());
		

	}

}
