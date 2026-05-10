import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("Iamsunil");
		al.add("hey there");
		System.out.println(al);
	
		ListIterator<String> itr =al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	

	}

}
