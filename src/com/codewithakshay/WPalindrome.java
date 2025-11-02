package com.codewithakshay;

import java.util.stream.IntStream;

/*23) Palindrome program using Java 8 streams*/

public class WPalindrome {

	public static void main(String[] args) {
	
		String str = "ROTATOR";
		
		boolean isPalindrome = IntStream.range(0, str.length() / 2)
							.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		
		if(isPalindrome)
			System.out.println(str + " is palindrome");
		else
			System.out.println(str+ " is not palindrome");
		
	}
	
}
