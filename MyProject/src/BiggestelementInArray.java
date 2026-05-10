import java.util.Arrays;
 
public class BiggestelementInArray {

	public static void main(String[] args)
	{
		int[] arr = {78, 89, 56, 98, 45};
    int max = Arrays.stream(arr).max().getAsInt();//Arrays.stream(arr) converts the array arr into a stream.
    System.out.println("Maximum value: " + max);// .max() finds the maximum element in the stream.
    //.getAsInt() retrieves the maximum value as an int.
		
	}

}
