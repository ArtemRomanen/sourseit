package com.sourseit.hometask3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Please enter height");
		Scanner myScanner = new Scanner(System.in);
		int height = myScanner.nextInt();
		height = Math.abs(height);
		if (height < 100) {
			char a[] = new char[height];
			for (int i = 1; i < height * 2; i++) {
				a = new char[height];
				if (i <= height) {
					Arrays.fill(a, 0, i, '*');
					System.out.println(Arrays.toString(a).replaceAll("\\[|,|\\]", " "));
				} else {
					Arrays.fill(a, 0, height * 2 - i, '*');
					System.out.println(Arrays.toString(a).replaceAll("\\[|,|\\]", " "));
				}
			}
		} else {
			System.out.println("So big height");
		}
		myScanner.close();
	}
}
