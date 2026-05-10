package coreJavaTopics;

public class TernaryPractice {

	public static void main(String[] args) {
		int number =0;
		if(number ==0)
			System.out.println("zero");
		else if(number > 0)
		System.out.println("positive");
		else
			System.out.println("negative");
		System.out.println((number ==0 )? "Zero":(number > 0)? "positive":"Negative");
	}
}
