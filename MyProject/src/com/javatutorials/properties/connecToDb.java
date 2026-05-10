package com.javatutorials.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.*;
import java.util.Map.Entry;

public class connecToDb {

	public static void main(String[] args) throws Exception {
		File file = new File("dbConfig.properties");
		if(!file.exists())
			file.createNewFile();
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		prop.setProperty("url","192.168.10.20");
//		prop.setProperty("url","localhost");//key-value pairs
	
		FileOutputStream fos = new FileOutputStream(file);
		
	prop.store(fos,"New Prop File is created");
//		FileInputStream fis = new FileInputStream(file);
//	prop.load(fis);
		
//		Set<Object> keys= prop.keySet();
//				//prop.stringPropertyNames();
//		System.out.println(keys);// only keys executes
//		
//		Collection<Object> c= prop.values();
//		System.out.println(c);// only values executes 
//		
//		// if we want to get the key based on value
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("username"));
//		System.out.println(prop.getProperty("machinename","lenova"));// to add the data by creating default vale i.e lenova
		// if we want to get both key and values in file
//		for (Object object : prop.keySet()) {
//			System.out.println(object+">>>"+prop.getProperty((String)object));	
//		}
//		Set<Entry<Object,Object>> data =prop.entrySet();
//		for (Entry<Object, Object> entry : data) {
//			System.out.println(entry.getKey()+">>>"+entry.getValue());
//			
//		}
		
		
	
	}

}
