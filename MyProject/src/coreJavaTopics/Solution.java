package coreJavaTopics;

public class Solution {
	
	public static int reverse(long x) {
		long reversenum=0;
		while(x!=0) {
			long digit =x%10;
			reversenum=(int) (reversenum*10+digit);
			x=x/10;
			if(reversenum>Integer.MAX_VALUE|| reversenum<Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) reversenum;
	}
	public static void main(String[] args) {
		
		System.out.println(Solution.reverse(15342));
	}

}
