package com.sourceit.hometask2;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a side");
		int a = myScanner.nextInt();
		System.out.println("Please enter b side");
		int b = myScanner.nextInt();
		System.out.println("Please enter c side");
		int c = myScanner.nextInt();
		displayTriangleSquare(Math.abs(a), Math.abs(b), Math.abs(c));
	}

	public static void displayTriangleSquare(double a, double b, double c) {
		if (a + b > c & b + c > a & a + c > b) {
			double p = (a + b + c) / 2;
			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("Sguare of triangle " + s);
		} else {
			System.out.println("Triangle can't be exist");
		}
	}
}