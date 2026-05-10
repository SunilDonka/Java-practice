package com.javatutorial.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFilterReduceSorted {

	int id;
	String name;
	double marks;

	public MapFilterReduceSorted(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public MapFilterReduceSorted(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MapFilterReduceSorted{" +
				"id=" + id +
				", name='" + name + '\'' +
				", marks=" + marks +
				'}';
	}

	public static void main(String[] args) {

		List<MapFilterReduceSorted> m = new ArrayList<>(Arrays.asList(
				new MapFilterReduceSorted (101,"sunil",23.5),
				new MapFilterReduceSorted(102,"ramesh",45.6),
				new MapFilterReduceSorted(103,"suresh",45.7)
		));

		List <MapFilterReduceSorted> num = m.stream()
				.filter(n->n.getId() %2==0)
				.sorted()
				.toList();

		num.forEach(n-> System.out.println(n));

		String s1="deloitte";
		Optional<Map.Entry<Character,Long>> en=s1.chars()
				.mapToObj(c-> (char) c).filter(c-> c!= ' ')
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue());

		en.ifPresent(entry -> System.out.println("Most fre charges :"+entry.getKey() + "-"+entry.getValue()));


		String str="abrakadabra";
		Map<Character,Integer> count = new LinkedHashMap<>();
		char ch ;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			count.put(ch,count.getOrDefault(ch,0)+1);
		}

		for(Map.Entry<Character,Integer> entry :count.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
				break;
			}
		}




//		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
//	nums.stream()
//				.filter(n->n%2==0)
//				.sorted();
//		nums.forEach((n->System.out.println(n)));// It actually sorting the values
				









				
//		int  result = nums.stream()
//						  .filter(n->n%2==0)
//						  .map(n->n*2)
//						  .reduce(0,(a,b)->(a+b));
//
//						  System.out.println(result);
				
	}

}


//Predicate<Integer> p = (n)-> n%2==0;
