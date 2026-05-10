package com.javatutorail.memorymanagement;

public class Employee {
	int orgId=4555;
	String orgName="javatutorial";
	String ceo="sunil";
	int noOfDep = 2;
	static double networth=500.00;
	
	public static void main(String[] args) throws Exception {
		int eid=101;
		String empName="Jhon";
		double salary=5000.00;
		
		Employee e1= new Employee();
		e1.getOrgId();
		e1.deleteEmployee(101);
		System.out.println(Employee.networth());
		
		Employee e2= new Employee();
		e2.deleteEmployee(101);
		
		Thread.sleep(5000);
	}
	public  int getOrgId() {
		return orgId;
		
	}
	public static double networth() {
		return networth;
	}
	public void deleteEmployee(int empID) {
		
	}

}


