package com.sourceit.hometask2;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		System.out.println("Please enter radius");
		Scanner myScanner = new Scanner(System.in);
		double i = myScanner.nextDouble();
		displayCycleLenght(i);
	}

	public static void displayCycleLenght(double r) {
		double l = 2 * Math.PI * r;
		System.out.println("Lenght of cycle is " + l);
	}
}
