package com.roughwork.mine;
import java.util.*;
import java.util.stream.*;

public class Practice1 {
	String name;
	int  age;
	int salary;
	
	public Practice1(String name,int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		List<Practice1> emp = Arrays.asList(
				new Practice1("sunil",23,334),
				new Practice1("raj",21,232),
				new Practice1("ram",21,232),
				new Practice1("rocky",21,232)
			
				);
		
		
			
		List<String> result = emp.stream()
				.filter(e->e.name.startsWith("r"))
				.map(e->e.name)
				.collect(Collectors.toList());
				
	
		System.out.println(result);
		
		
	}

}
