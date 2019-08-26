package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubsequenceWord {

	
	public static void main(String[] args) {		
		String S = "abppplee";
		String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
		
		assertEquals("apple", find(S,D));
		
	}
	
	
	public static String find (String S, String[] D) {
		
		String subsequence = "";
		
		for (String dWord : D) {
			
			int fromIndex = -1;
			int indexOf = -1;
			
			for (char dLetter : dWord.toCharArray()) {
				
				indexOf = S.indexOf(dLetter, fromIndex + 1);
				
				if (indexOf == -1) {
					break;
				} else {
					fromIndex = indexOf;
				}	
			}
			
			if (indexOf != -1) {
				subsequence = dWord.length() > subsequence.length() ? dWord : subsequence;
			}
		}
		
		
		return subsequence;
	}

}