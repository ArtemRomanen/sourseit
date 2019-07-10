package com.sourseit.hometask4;

public class Task2 {

	public static void main(String[] args) {

		int[] array = { 2, 4, 7, 3, 9, 11 };
		System.out.println(maxNumber(array));
	}

	public static int maxNumber(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];
			}
		}
		return max;
	}
}