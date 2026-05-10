package com.javatutorial.Comparator;
import java.util.*;

public class Employee implements Comparable<Employee>{

	int age;
	String name;
	double marks;

	public Employee(int age,String name,double marks) {
		this.age=age;
		this.name=name;
		this.marks=marks;

	}

	public String toString() {
		return "name: "+ name +" age: "+age+" marks "+marks;

	}

	@Override
	public int compareTo(Employee e) {

			return Integer.compare(this.age, e.age);
//			return this.name.compareTo(e.name);
//		return Double.compare(e.marks,this.marks);

	}

	public static void main(String[] args)
	{

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(12,"sunil",12));
		emp.add(new Employee(13,"ramesh",14));
		emp.add(new Employee(14,"wisdom",19));
		emp.add(new Employee(18,"cat",21));
		emp.add(new Employee(15,"apple",20));
		emp.add(new Employee(16,"boy",21));


		Collections.sort(emp);
		for (Employee employee : emp) {
			System.out.println(employee);

		}


	}




}
