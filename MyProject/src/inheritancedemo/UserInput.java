package inheritancedemo;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey hi, may i know  your name?");
		String name = s.nextLine();
		System.out.println("hey "+ name +" how are you,how's your day?");
		String day=s.nextLine();
		System.out.println("oh that's wonderfull,can i say something? "+name);
		String mood =s.nextLine();
		System.out.println("May I know your age");
		String  thank = s.nextLine();
		System.out.println("Oh,You looking so young "+name);
		String  greet = s.nextLine();
		System.out.println("Your welcome");

	}
}



