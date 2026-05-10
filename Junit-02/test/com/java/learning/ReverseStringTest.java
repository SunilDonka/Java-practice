package com.java.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		String actual = reverse.reverseString("java");
		
		String expected ="avaj";
		assertEquals(actual,expected);
	}

}
