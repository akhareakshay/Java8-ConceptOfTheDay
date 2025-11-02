package com.codewithakshay;

import java.util.stream.Stream;

/*29) Fibonacci series*/

public class ZCFibonacciSeries {

	public static void main(String[] args) {
		
		Stream.iterate(new int[] {0, 1}, i -> new int[] {i[1], i[0] + i[1]})
							.limit(10)
							.map(i -> i[0])
							.forEach(System.out::println);
		
	}
	
}
