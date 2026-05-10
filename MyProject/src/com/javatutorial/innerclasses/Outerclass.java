package com.javatutorial.innerclasses;

public class Outerclass {
	private int id =10;
	public static void main(String[] args) {
		int salary=5000;
		
		Student1 s= new Student1() {

			@Override
			public void attend() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getmarks() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		s.attend();
		s.getmarks();		
		
		
		class class1 implements Student1{

			@Override
			public void attend() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getmarks() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		
//		AbstractClass ab = new AbstractClass(){
//			public void print() {
//			}
//		};
//		ab.show();
	}
}
		 
//		class1 c1=new class1() {
//			public void print() {
//			System.out.println("updated print method is called");
//			}	
//		};
//		c1.show();
//		c1.print();
//		class A{
//			
//			public void print() {
//				System.out.println("Salary is "+salary);
//			}
//		}// Non static class // member of a class //local class
//		
//		A a= new A();
//		a.print();
//	}
//}

//	public void show() {
//		System.out.println("show method is called");
//	}
		

//class class2 extends class1{
//	public void print() {
//		System.out.println("updated print method is called");
//	}
//	
//}









