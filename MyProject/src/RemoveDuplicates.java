import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array= {"ip","ip2","ip3","ip2","ip1","ip2"};
		Set<String> set = new HashSet<>(Arrays.asList(array));
		String[] uniqueArray=set.toArray(new String[0]);
		System.out.println(Arrays.toString(uniqueArray));
		

	}

}
