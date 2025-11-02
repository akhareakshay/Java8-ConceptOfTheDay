package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*22) How do you find the most repeated element in an array?*/

public class VFindMostRepeatedElement {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		
		Map<String, Long> collectElementsWithCount = listOfStrings.stream()
							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Set<Entry<String, Long>> entrySet = collectElementsWithCount.entrySet();
		
		for(Entry<String, Long> element : entrySet) {
			if(element.getValue() > 1) {
				System.out.println(element.getKey());
			}
		}
		
		System.out.println("---------------------");
		
		Entry<String, Long> mostRepeatedElement = collectElementsWithCount.entrySet().stream()
																.max(Map.Entry.comparingByValue())
																.get();
		System.out.println(mostRepeatedElement.getKey());
		System.out.println(mostRepeatedElement.getValue()+" times repeated");
	}

}
