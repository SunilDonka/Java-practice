package com.javatutorials.exceptionhandling;

import java.io.*;

public class TrywithResources {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		// Autoclosable
		try (
				FileReader fr = new FileReader(file);
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
			){
// we can only do send the instances of classes 
//which implements autoclosable interface as resources(i.e defining and initialisation)
			
//			String text =" ";
			 String line =" ";
			 while((line = br.readLine())!=null) {
				 System.out.println(line);
				 
			 }
		}
			catch(Exception e ) {
				e.printStackTrace();	
			}
		
		
		

	}

}
