package com.test;

import static org.junit.Assert.assertEquals;

public class StringSplosion {

	public static void main(String[] args) {
		
		assertEquals(stringSplosion("Code"), "CCoCodCode");
		assertEquals(stringSplosion("abc"), "aababc");
		assertEquals(stringSplosion("ab"), "aab");
		
	}

	public static String stringSplosion(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.substring(0, i + 1));
		}
		return sb.toString();
	}

}
