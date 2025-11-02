package com.codewithakshay;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*18) Reverse each word of a string using Java 8 streams?*/

public class RReverseEachWord {

	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";
		
		String reversedWordsString = Arrays.stream(str.split(" "))
					.map(n -> new StringBuffer(n).reverse())
		 			.collect(Collectors.joining(" "));
		System.out.println(reversedWordsString);
		
	}
	
}
