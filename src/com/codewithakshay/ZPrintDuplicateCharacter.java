package com.codewithakshay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*26) Print duplicate characters in a string?*/

public class ZPrintDuplicateCharacter {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		
		HashSet<String> hashset = new HashSet<String>();
		
		Set<String> duplicateCharacters = Arrays.stream(inputString.split(""))
			 				.filter(i -> !hashset.add(i))
			 				.collect(Collectors.toSet());
		System.out.println(duplicateCharacters);
		
	}
	
}
