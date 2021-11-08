package com.qa.helloworld;

public class ArrayIntegerExercise {

	public static void main(String[] args) {

		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[][] value = {{2, 4, 6}, {1, 3, 5}};

		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {  // OR value[i] = i*10;
				System.out.println(value[i][j]*10);
			}
		}

	}

}
