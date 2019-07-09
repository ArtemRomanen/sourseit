package com.sourseit.hometask3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter widthCount");
		int widthCount = myScanner.nextInt();
		System.out.println("Please enter stripCount");
		int stripCount = myScanner.nextInt();
		System.out.println("Please enter lineCount");
		int lineCount = myScanner.nextInt();

		char[] picture = new char[widthCount];
		for (int j = 0; j < lineCount; j++) {
			for (int i = 0; i < stripCount; i++) {
				if (i % 2 == 0) {
					Arrays.fill(picture, 0, widthCount, '+');
					System.out.print(Arrays.toString(picture).replaceAll("\\[|,|\\]", ""));
				} else {
					Arrays.fill(picture, 0, widthCount, '*');
					System.out.print(Arrays.toString(picture).replaceAll("\\[|,|\\]", ""));
				}
			}
			System.out.println();
		}
		myScanner.close();
	}
}
