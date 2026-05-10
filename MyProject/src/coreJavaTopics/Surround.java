package coreJavaTopics;

public class Surround {
	
	public int numbersOfeven(int a) {
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("its odd ");
		}
		return a;
	}
	
	public int  noOfWords(String s1) {
		 int s2= s1.length();
		return s2;
	}
	
	
	public static void main(String[] args) {
		Surround s = new Surround();
//		s.numbersOfeven(9);
		s.noOfWords("sunil");
	}

}
