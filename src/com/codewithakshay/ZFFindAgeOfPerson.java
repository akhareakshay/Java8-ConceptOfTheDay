package com.codewithakshay;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*32) Find the age of a person in years if the birthday has given?*/

public class ZFFindAgeOfPerson {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1985, 01, 23);
		
		LocalDate todaysDate = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, todaysDate));
		
	}
	
}
