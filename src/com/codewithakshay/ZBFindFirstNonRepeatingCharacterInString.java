package com.codewithakshay;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*28) Find first non-repeated character in a string?*/

public class ZBFindFirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		
		LinkedHashMap<String, Long> charsWithCount = Arrays.stream(inputString.split(""))
		 				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		String firstNonRepeatingCharacter = charsWithCount.entrySet().stream()
												.filter(i -> i.getValue() == 1)
												.map(i -> i.getKey())
												.findFirst()
												.get();
												
		System.out.println(firstNonRepeatingCharacter);
		
	}
	
}
