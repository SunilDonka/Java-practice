package com.javatutorial.Comparator;

import java.util.*;

public class Teacher implements Comparable<Teacher> {
	private int age;
	private String name;
	
	public Teacher(int age,String name) {
		this.age=age;
		this.name=name;
	}

	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	@Override
	public int compareTo(Teacher that) {
//		return Integer.compare(this.age, that.age);
		
		return this.name.compareToIgnoreCase(that.name);
		
	}
	
	public String toString() {
		return "name='"+name +"',age="+age+"";
		}
	
	public static void main(String[] args) {
		List<Teacher> students = new ArrayList<>();
		students.add(new Teacher(33,"Navin"));
		students.add(new Teacher(12,"John"));
		students.add(new Teacher(45,"edward"));
		students.add(new Teacher(35,"michael"));
		
	Collections.sort(students);
		
		for ( Teacher s: students) {
			System.out.println(s);
			
		}
		
		
	}
	
}
	
