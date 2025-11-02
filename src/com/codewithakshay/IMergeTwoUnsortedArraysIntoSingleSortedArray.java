package com.codewithakshay;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?*/

public class IMergeTwoUnsortedArraysIntoSingleSortedArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
        
        int[] sortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        										.sorted()
        										.toArray();
        System.out.println(Arrays.toString(sortedArray));
        
	}
	
}
