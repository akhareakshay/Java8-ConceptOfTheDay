package com.codewithakshay;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*21) Print first 10 even numbers*/

public class UPrintFirstTenEvenNumbers {

	public static void main(String[] args) {
		
		IntStream.range(1, 100)
					.filter(n -> n % 2 == 0)
					.limit(10)
					.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		IntStream.rangeClosed(1, 10)
						.map(i -> i * 2)
						.forEach(System.out::println);
					
		
	}
	
}
