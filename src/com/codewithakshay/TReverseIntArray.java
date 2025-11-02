package com.codewithakshay;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*20) Reverse an integer array*/

public class TReverseIntArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		
		int[] reversedArray = IntStream.rangeClosed(1, array.length)
					.map(i -> array[array.length - i]).toArray();
		
		System.out.println("Reversed Array : "+Arrays.toString(reversedArray));
		
	}
	
}
