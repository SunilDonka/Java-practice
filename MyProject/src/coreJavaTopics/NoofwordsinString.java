package coreJavaTopics;
import java.util.*;

public class NoofwordsinString {

	public static void main(String[] args) {
		String a= "He is a very very good boy, isn't he?";
	    int countWords = a.split("\\s").length;
	    System.out.println(countWords);
	}

}
