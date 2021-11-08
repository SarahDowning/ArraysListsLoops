package com.qa.helloworld;

public class EnhancedLoopExercises {

	public static void main(String[] args) {

		System.out.println(isEven(8));

		String[] array1 = { "Sarah", "Jay", "Bailey" };
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// Exercise 1

		for (String names : array1) {
			System.out.println(names);
		}

		// Exercise 2

		for (int number : numbers) {
			System.out.println(number * number);
		}

		// Exercise 4
		for (int number : numbers) {
			if (isEven(number)) {
				System.out.println(number * number * number + " The root number is even!");
			} else {
				System.out.println(number * number + " The root number is odd!");
			}
		}
	}

	// Exercise 3
	int num1;

	public static boolean isEven(int num1) {
		if (num1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}