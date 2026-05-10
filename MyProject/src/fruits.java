import java.util.*;
public class fruits {

	public static void main(String[] args) {
		ArrayList<String> fruits= new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("mango");
		fruits.add("apple");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		

	}

}
