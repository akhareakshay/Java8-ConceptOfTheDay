package com.codewithakshay;

import java.util.Arrays;
import java.util.stream.Stream;

/*16) Given an integer array, find sum and average of all elements?*/

public class PFindSumAndAverageOfElements {

	public static void main(String[] args) {
		
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		int sum = Arrays.stream(a).sum();
		System.out.println("sum of numbers : "+sum);
		
		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("average of numbers : "+average);
		
	}
	
}
