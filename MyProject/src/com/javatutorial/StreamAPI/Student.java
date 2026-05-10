package com.javatutorial.StreamAPI;

import java.util.*;
import java.util.List;

public class Student {
	
	private int age;
	private String name;
	
	public Student() {
		
	}
public Student(String name) {
	this.name=name;
		
	}
public Student(String name,int age) {
	this.name=name;
	this.age=age;
}

	public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Navin","ramesh","suresh");
		
		List<Student> students = names.stream()
										.map(name-> new Student(name))
										.toList();
		
		
		List<Student> students2 = names.stream()
									.map(Student::new)
									.toList();
		
		
//				students.forEach(System.out::println);
				students2.forEach(System.out::println);
				
		

	}

}
