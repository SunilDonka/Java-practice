package com.javatutorial.Comparator;
import java.util.*;

public class Student {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "name : "+name+","+" age : "+ age;
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(33, "Navin"));
		students.add(new Student(22, "raja"));
		students.add(new Student(12, "michael"));
		students.add(new Student(45, "ramesh"));
		students.add(new Student(45, "Paramesh"));
		students.add(new Student(45, "Tapesh"));
		students.add(new Student(42, "suresh"));
		
		Comparator<Student> nameComparator = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return Integer.compare(0, 0);
				
//				return s1.name.compareToIgnoreCase(s2.name);
				
			}
			
		};
		
		Collections.sort(students,nameComparator);
		
		for (Student student : students) {
			System.out.println(student);
			
		}

	}

}
