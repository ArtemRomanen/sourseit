package com.sourceit.hometask2;

import java.util.Scanner;

public class Task1 {

	public static void main(String args[]) {
		System.out.println("Please enter 6 numbers");
		Scanner myScanner = new Scanner(System.in);
		int i = myScanner.nextInt();
		displayNumbers(Integer.toString(Math.abs(i)));
	}

	public static void displayNumbers(String number) {
		if (number.length() == 6) {
			for (int i = 0; i < number.length(); i++) {
				System.out.println(number.toCharArray()[i]);
			}
		} else {
			System.out.println("Please input 6 numbers");
		}
	}
}
