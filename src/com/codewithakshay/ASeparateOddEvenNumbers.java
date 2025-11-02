package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*1) Given a list of integers, separate odd and even numbers?*/

public class ASeparateOddEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		
		List<Integer> evenNumbers = listOfIntegers.stream()
							.filter(n -> n % 2 == 0)
							.collect(Collectors.toList());
		System.out.println("Even Numbers : "+evenNumbers);
		
		List<Integer> oddNumebs = listOfIntegers.stream()
							.filter(n -> n % 2 != 0)
							.collect(Collectors.toList());
		System.out.println("Odd Numbers : "+oddNumebs);
		
		
		Map<Boolean, List<Integer>> oddEvenNumsList = listOfIntegers.stream()
							.collect(Collectors.partitioningBy(n -> n % 2 == 0));
	
		Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumsList.entrySet();
		for(Entry<Boolean, List<Integer>> entry : entrySet) {
			System.out.println("-------------");
			
			if(entry.getKey())
				System.out.println("Even Numbers ");
			else 
				System.out.println("Odd Numbers ");
			
			List<Integer> valueList = entry.getValue();
			for(int i : valueList) {
				System.out.println(i);
			}
		}
	}

}
