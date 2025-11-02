package com.codewithakshay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*25) How do you extract duplicate elements from an array?*/

public class YExtractDuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		
		Map<Integer, Long> elementsWithCount = listOfIntegers.stream()
							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Set<Entry<Integer, Long>> entrySet = elementsWithCount.entrySet();
		for(Entry<Integer, Long> element : entrySet) {
			if(element.getValue() > 1) {
				System.out.println(element.getKey());
			}
		}
		
		
		
//		Another way 
		HashSet<Integer> intElements = new HashSet<>();
		
		Set<Integer> uniqueElements = listOfIntegers.stream()
							.filter(i -> !intElements.add(i))
							.collect(Collectors.toSet());
		System.out.println(uniqueElements);					
		
		
	}
	
}
