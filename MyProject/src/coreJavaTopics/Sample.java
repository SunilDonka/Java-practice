package coreJavaTopics;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(9,3,9,0,3,9,8,4,8);
		
		
		Map<Integer,Integer> hm = new LinkedHashMap<>();
		for (Integer str : num) {
			hm.put(str, hm.getOrDefault(str,0)+1);
		}
		
		for(Map.Entry<Integer,Integer>entry :hm.entrySet()) {
			System.out.println(entry.getKey()+"occured "+"->"+entry.getValue()+"times");
		}

	}

}
