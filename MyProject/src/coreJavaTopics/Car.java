package coreJavaTopics;

import java.util.Arrays;

public interface Car {
	String companyName ="jaguar";
	void drive();
	
	default void headLight() {
		System.out.println(Arrays.toString(this.getClass().getDeclaredMethods()));
	}

}
