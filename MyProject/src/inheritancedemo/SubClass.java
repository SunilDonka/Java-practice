package inheritancedemo;

import com.javatutorial.accessmodifiers.Student;

public class SubClass extends Student{
	
	public void test() {
		printRollNum();
		System.out.println(rollNo);
		
	}

	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.test();
		
		
		// TODO Auto-generated method stub

	}

}
