package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*7) From the given list of integers, print the numbers which are multiples of 5?*/

public class GPrintNumbersMultiplesOfFive {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		listOfIntegers.stream()
							.filter(n -> n % 5 == 0)
							.forEach(System.out::println);
		
	}
	
}
