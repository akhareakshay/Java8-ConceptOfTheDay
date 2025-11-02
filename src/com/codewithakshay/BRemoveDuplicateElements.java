package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*2) How do you remove duplicate elements from a list using Java 8 streams?*/

public class BRemoveDuplicateElements {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		List<String> uniqueElements = listOfStrings.stream()
						  .distinct()
						  .collect(Collectors.toList());
		System.out.println(uniqueElements);
		
		
		Set<String> uniqueSetElements = listOfStrings.stream()
							.collect(Collectors.toSet());
		System.out.println(uniqueSetElements);
		
	}
	
}
