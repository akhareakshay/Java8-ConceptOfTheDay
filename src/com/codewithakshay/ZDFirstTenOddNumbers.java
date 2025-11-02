package com.codewithakshay;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*30) First 10 odd numbers*/

public class ZDFirstTenOddNumbers {

	public static void main(String[] args) {
		
		IntStream.range(0, 100)
			.filter(i -> i % 2 != 0)
			.limit(10)
			.forEach(System.out::println);
		
		
		System.out.println("------------------");
		
//		another way
		Stream.iterate(new int[] {1, 3}, i -> new int[] {i[1], i[1] + 2})
						.limit(10)
						.map(n -> n[0])
						.forEach(System.out::println);
	}
	
}
