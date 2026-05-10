package com.javatutorial.staticOrNonStatic;

public class Test2 {
	static { 
		System.out.println("static block");//static block
		
	} 
	
	{
		
		System.out.println("non static block");//non static block
			
	}
	
	public  Test2() {
		System.out.println("constructor block");
		
	}
	public static void main(String[] args) {
//		System.out.println(Test1.number);
//		Test1.print();
//		Test1 t1 = new Test1();
//		Test2 t2= new Test2();
//		Test2 t3= new Test2();
//		Test2 t4= new Test2();
//		Test2 t5= new Test2();
//		
//		t1.print2();//so this is non static method which means we are accessing through
		//creating an instance of that class i.e object .
	
		
		// we can access static variables or static methods directly
		//by class names . so here we are accessing test 1 in test 2 . 

	}

}
