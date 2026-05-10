package com.javatutorial.POJOJavaBean;

public class Program1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.name ="sunilDonka";// we are accessing directly due to its access modifiers
		e1.salary=7200.00;// same reason as above access modifiers
		
//		System.out.println(e1.getId());
//		System.out.println(e1.name);
//		System.out.println(e1.salary);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.name="Daniel";
		e2.salary=3000.00;
		
//		System.out.println(e2.getId());
//		System.out.println(e2.name);
//		System.out.println(e2.salary);
		
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.name="Crystal";
		e3.salary=4000.00;
		
//		System.out.println(e3.getId());
//		System.out.println(e3.name);
//		System.out.println(e3.salary);
		
		Employee[] emp = {e1,e2,e3};// We created an array emp i.e stored all employee information in it.
//		e3.setId(102);
//		System.out.println(e1.name="apple");
//		System.out.println(e2.salary=34.56);
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Name: "+emp[i].getname());
			System.out.println("Id: "+emp[i].getId());
			System.out.println("Salary: "+emp[i].getsalary());
		}
				

	}

}
