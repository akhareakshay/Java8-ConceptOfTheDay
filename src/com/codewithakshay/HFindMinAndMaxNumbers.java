package com.codewithakshay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*8) Given a list of integers, find maximum and minimum of those numbers?*/

public class HFindMinAndMaxNumbers {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		Integer minNumber = listOfIntegers.stream()
								.min(Comparator.naturalOrder()).get();
		System.out.println("min number : "+minNumber);
		
		Integer maxNumber = listOfIntegers.stream()
							.max(Comparator.naturalOrder()).get();
		System.out.println("max number : "+maxNumber);
		
	}
	
}
