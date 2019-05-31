package com.test;

public class LongestSubsequenceWord {

	
	public static void main(String[] args) {		
		String S = "abppplee";
		String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
		
		System.out.println(find(S,D));
	}
	
	
	public static String find (String S, String[] D) {
		
		int indexSubsequenceFound = -1;
		for (int i=0;i<D.length;i++) {
			char[] dCharArray = D[i].toCharArray();
			
			int fromIndex = -1;
			for (int j=0;j<dCharArray.length;j++) {
				
				char dLetter = dCharArray[j];
				fromIndex = S.indexOf(dLetter, fromIndex + 1);
				
				if (fromIndex == -1) {
					break;
				}
			}
			
			if (fromIndex != -1) {	
				if (indexSubsequenceFound == -1) {
					indexSubsequenceFound = i;
				} else {
					if (D[i].length() >= D[indexSubsequenceFound].length()) {
						indexSubsequenceFound = i;
					}
				}
			}			
		}
		
		String subsequenceFound = "";
		if (indexSubsequenceFound != -1) {
			subsequenceFound = D[indexSubsequenceFound];
		}
		
		return subsequenceFound;
	}

}