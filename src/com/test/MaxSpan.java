package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSpan {
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 1, 1, 3};
		assertEquals(maxSpan(array), 4);
		
		int[] array2 = {1, 4, 2, 1, 4, 1, 4};
		assertEquals(maxSpan(array2), 6);
		
		int[] array3 = {1, 4, 2, 1, 4, 4, 4};
		assertEquals(maxSpan(array3), 6);
	}
	

	public static int maxSpan(int[] nums) {
		int maxSpan = 0;

		if (nums.length > 0) {

			maxSpan = 1;
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					
					if (nums[i] == nums[j]) {
						int span = (j - i) + 1;
						if (maxSpan < span) {
							maxSpan = span;
						}
					}
				}
			}
		}
		return maxSpan;
	}

}
