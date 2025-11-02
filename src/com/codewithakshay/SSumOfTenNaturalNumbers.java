package com.codewithakshay;

import java.util.stream.IntStream;

/*19) How do you find sum of first 10 natural numbers?*/

public class SSumOfTenNaturalNumbers {

	public static void main(String[] args) {
		
		int sumOfFirstTenNaturalNumbers = IntStream.range(1, 11).sum();
		
		System.out.println(sumOfFirstTenNaturalNumbers);
		
	}
	
}
