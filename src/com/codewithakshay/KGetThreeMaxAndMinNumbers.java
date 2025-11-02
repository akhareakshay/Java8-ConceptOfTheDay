package com.codewithakshay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*11) How do you get three maximum numbers and three minimum numbers from the given list of integers?*/

public class KGetThreeMaxAndMinNumbers {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> threeMinNumbers = listOfIntegers.stream()
							.sorted().limit(3).collect(Collectors.toList());
		System.out.println("3 minumum numbers : "+threeMinNumbers);
		
		List<Integer> threeMaxNumbers = listOfIntegers.stream()
							.sorted(Comparator.reverseOrder())
							.limit(3)
							.collect(Collectors.toList());
		System.out.println("3 maximum numbers : "+threeMaxNumbers);
		
		
	}
	
}
