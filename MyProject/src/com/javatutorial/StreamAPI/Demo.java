package com.javatutorial.StreamAPI;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.javatutorail.memorymanagement.Employee;


public class Demo {

	public static void main(String[] args) {

//		List<Employee> employees = EmployeeData.get();
//		List<String> names =employees.stream()
//				.map(Employee::getFirstname)
//				.distinct()
//				.sorted()
//				.toList();
//		System.out.println(names);
//
//
//		Map<String,Double> empnames =employees.stream()
//				.collect(Collectors.toMap(
//						e->e.getFirstname(),
//						e->e.getSalary()));
//		System.out.println(empnames);



//				.max(Comparator.comparing(Employee::getSalary))
//				.map(e->e.getSalary())
//				.ifPresent(n-> System.out.println(n));
//


//
//		Double result = employees.stream()
//				.filter(e->e.getDepartment().equals("Dev"))
//						.mapToDouble(Employee::getSalary)
//								.reduce(0,(c,e)->(c+e));
//		System.out.println(result);


//				.map(Employee::getFirstname)
//				.sorted(Comparator.reverseOrder())
//
//				.forEach(n-> System.out.println(n));


//				.map(Employee::getSalary)
//				.distinct()
//				.sorted(Comparator.reverseOrder())
//				.skip(1)
//				.findFirst()
//				.ifPresent(n-> System.out.println(n));

//				.min(Comparator.comparingDouble(Employee::getSalary))
//				.map(n->n.getSalary())
//				.ifPresent(n-> System.out.println(n));

//				.max(Comparator.comparingDouble(Employee::getSalary))
//				.map(n->n.getFirstname()+":"+n.getSalary())
//				.ifPresent(n-> System.out.println(n));






//






List<String> words= Arrays.asList("cat","horse","zebra","elephant","cow");

long count =words.stream()
		.filter(e->e.length()>3)
		.count();
		System.out.println(count);






	}
	}