package com.javatutorail.memorymanagement;

public class GarbageCollection {
	
	
	public void finalize() {
		System.out.println("Finalize methods is called");
		
	}

	public static void main(String[] args) {
		//Unused Objects
		//Un-referenced Objects
		//Ananonymous objects
		GarbageCollection gcp1= new GarbageCollection();
		GarbageCollection gcp2= new GarbageCollection();
		GarbageCollection gcp3= new GarbageCollection();
		
		new GarbageCollection();// Ananonymous or un referenced object

		gcp1=null;// onw way to call finalize method
		gcp2=gcp3;// these are unreferenced objects another way to call finalize method
	
		System.gc();
		

	}

}
