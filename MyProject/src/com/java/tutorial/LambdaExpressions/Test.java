package com.java.tutorial.LambdaExpressions;
@FunctionalInterface
interface Addable {
	void add();

}



public class Test
{
	public static void main(String[] args) {
		Addable a = ()->{
			System.out.println("using lamda expressions");
		};

		a.add();
	}


	

}




