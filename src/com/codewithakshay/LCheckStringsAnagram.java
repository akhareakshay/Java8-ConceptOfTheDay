package com.codewithakshay;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*12) Java 8 program to check if two strings are anagrams or not?*/

public class LCheckStringsAnagram {

	public static void main(String[] args) {
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        String string1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        
        String string2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        
        if(string1.equals(string2))
        	System.out.println("anagram");
        else 
        	System.out.println("not anagram");
		
	}
	
}
