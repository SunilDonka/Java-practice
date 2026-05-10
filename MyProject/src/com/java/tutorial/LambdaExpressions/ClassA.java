package com.java.tutorial.LambdaExpressions;


public class ClassA {

	public static void main(String[] args) {
//		Audi a = new Audi();
//		a.drive(50,"BMW");
//		Car c1 = new Car() {
//			@Override
//			public void drive(int speed,String model) {
//				System.out.println("driving");
//			}
//		};
//		c1.drive(70,"BMW");// Anonymous class (one way)
	//-------------------------------------------------//	
		Car c2 = (year,speed,name,condition)->{
			
		System.out.println("Model of Car: "+name);
		System.out.println("Year: "+year);
		System.out.println("Car Condition: "+condition);
		if(speed >100)
			System.out.println("speed driving");
		else
			System.out.println("best driving");
		System.out.println("------------------");
		};
		c2.drive(2016,40,"TATA","Car is strong");// Lambda expression with anonymous function
		c2.drive(2014,50,"BMW","luxury car");
		c2.drive(2025,150, "GT Corvette","sports car");
	}
	
	
}
//------------------------------------------------------//
//class Audi implements Car{
//	@Override
//	public void drive(int speed, String model) {
//		System.out.println("Drving audi");
//	}
//}// (Traditional way)
//------------------------------------------------//
@FunctionalInterface
interface Car{
	public void drive(int year,int speed,String name,String condition);// Abstract method	
}