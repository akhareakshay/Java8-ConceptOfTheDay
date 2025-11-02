package com.codewithakshay;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*3) How do you find frequency of each character in a string using Java 8 streams?*/

public class CFindFrequencyOfEachCharacter {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day";
		
		Map<Character, Long> charCount = inputString.chars()
																.mapToObj(n -> (char) n)
																.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		
//		without counting spaces
		Map<Character, Long> charCountWithoutSpaces = inputString.replace(" ", "").chars()
												.mapToObj(n -> (char) n)
												.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCountWithoutSpaces);
		
		
//		ignore case 
		Map<String, Long> ignoringCase = Stream.of(inputString.replace(" ", "").split(""))
			.map(n -> (String) n.toUpperCase())
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(ignoringCase);
	}
	
}
