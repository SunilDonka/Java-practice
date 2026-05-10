package coreJavaTopics;

public class LatestSwitchPractice {

	public static void main(String[] args) {
		// Updated version of switch expression
		String s="sat";
		switch (s) {
		case "mon","tue","wed","thu","fri" ->System.out.println("uff its weekday");
		case "sat","sun"->System.out.println("yeay its weekend");
		default->throw new IllegalArgumentException("Unexpected Value"+s);
		}
		
	}
		
		
//		int number =20;
//		String result =" ";
//			result =switch(Integer.compare(number,0)) {
//			case -1 -> result ="negative";
//			case 0 -> result ="Zero";
//			case 1 -> result ="positive";
//			
//			default -> throw new IllegalArgumentException("unexpected value"+Integer.compare(number, 0));
//			
//			};
//			System.out.printf("the given number %d %s  ",+number,result);
//			
			
			
			
			
	
			
//		int number =20;
//		switch(Integer.compare(number,0)) {
//		case -1->System.out.println("the given number is"+number);
//		case 0->System.out.println("the given number is"+number);
//		case 1->System.out.println("the given number is"+number);
//		
//		}
		
		
	
		
		
		
		
		// Older version od switch expression
//		switch(Integer.compare(number,0)) {
//		case -1:
//			System.out.println("negative");
//			break;
//		case 0:
//			System.out.println("Zero");
//			break;
//		case 1:
//			System.out.println("positive");
//			break;
//
//	}
	}

