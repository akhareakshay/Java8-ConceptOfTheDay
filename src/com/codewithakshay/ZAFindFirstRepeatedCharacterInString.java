package com.codewithakshay;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*27) Find first repeated character in a string?*/

public class ZAFindFirstRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		
		LinkedHashMap<String, Long> charsWithCount = Arrays.stream(inputString.split(""))
			 				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		String firstRepeatingCharacter = charsWithCount.entrySet().stream()
								.filter(i -> i.getValue() > 1)
								.map(i -> i.getKey())
								.findFirst()
								.get();
		System.out.println(firstRepeatingCharacter);
		
	}
	
}
