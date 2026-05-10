package com.javatutorial.casting;
import java.util.*;

public class WrapperClasses {

	public static void main(String[] args) {
		int i =20;
		
		/* Wrapper Classes
		 * byte->Byte
		 * short-> Short
		 * int-> Integer
		 * double->Double
		 * float-> Float
		 * char-> Char
		 * boolean-> Boolean
		 * 
		 */
		WrapperClasses wc= new WrapperClasses();
		Integer i3= Integer.valueOf(55);
		//int ii=i3.intValue();// unboxing
		
		int ii=i3;//auto-unboxing
		Integer i2 = Integer.valueOf(i);// boxing (this is updated
//		Integer i2= i;// auto-boxing
//		Integer i2= new Integer(55);//boxing(this is depricated)
		ArrayList<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(55);
		al.add(Integer.valueOf(65));
		
		int age = al.get(0);// auto un boxing
		System.out.println(al);
		
		byte b=55;
		double d =10.2;
		short s=(short)d;// explicit conversion
		
		String a="123";
		String e="14";
		int t =Integer.valueOf(a);
		int g = Integer.parseInt(e);		
		
		System.out.println(t);
		System.out.println(e);
		

	}

}
