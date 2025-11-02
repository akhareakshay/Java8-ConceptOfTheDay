package com.codewithakshay;

import java.util.Arrays;
import java.util.List;

/*24) Given a list of strings, find out those strings which start with a number?*/

public class XStringsStartsWithNumbers {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		listOfStrings.stream()
							.filter(n -> Character.isDigit(n.charAt(0)))
							.forEach(System.out::println);
		
	}
	
}
