import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter lenghth value");
		int length = s.nextInt();
		System.out.println("Enter breadth value");
		int breadth =  s.nextInt();
		System.out.println();
		int area= length*breadth;
		System.out.println("The area of rectangle is "+area);
		}
}
		