package com.codewithakshay;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*13) Find sum of all digits of a number in Java 8?*/

public class MSumOfNumbers {

	public static void main(String[] args) {
		
		int i = 156233;
		
		Integer sumOfNumbers = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("sum of numbers : "+sumOfNumbers);
		
	}
	
}
