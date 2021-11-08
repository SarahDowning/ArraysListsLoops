package com.qa.helloworld;

public class StringManipulationExercise {

	public static void main(String[] args) {
		
		//Exercise 1a.
		
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		
		//Exercise 1b.
		
		String subString1 = str2.substring(0, 11);
		String subString2 = str1.substring(16,24);
		System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
	}

}
