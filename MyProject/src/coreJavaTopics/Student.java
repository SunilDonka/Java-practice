package coreJavaTopics;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,4,3,2,1);
		
		 List<Integer> reversedList = new ArrayList<>(nums); // Create a mutable list
	        Collections.reverse(reversedList);
	        System.out.println(reversedList); 
	        
	        
//		List<Integer> nums2= nums.stream()
//				.sorted(Comparator.reverseOrder())
//				.toList();
//		System.out.println(nums2);
//		nums2.forEach((n)->System.out.print(n));
				
		
		
		
		
		
	}

}
