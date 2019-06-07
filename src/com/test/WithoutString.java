package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutString {
	
	public static void main(String[] args) {
		assertEquals(withoutString("Hello there", "llo"),"He there");
		assertEquals(withoutString("Hello there", "e"), "Hllo thr");
		assertEquals(withoutString("Hello there", "x"), "Hello there");
	}
	
	

	public static String withoutString(String base, String remove) {

		String without = base;
		int index = without.toLowerCase().indexOf(remove.toLowerCase());
			
		while (index > -1) {
			without = without.substring(0, index)
					+ without.substring(index + remove.length());

			index = without.toLowerCase().indexOf(remove.toLowerCase());
		}

		return without;
		
	}
}
