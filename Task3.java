package com.sourseit.hometask4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter hight");
		int hight = myScanner.nextInt();
		System.out.println("Please enter width");
		int width = myScanner.nextInt();
		paintPicture(hight, width);
	}

	public static void paintPicture(int hight, int width) {

		for (int i = 0; i < hight; i++) {
			if (i == 0 || i == hight - 1) {
				for (int j = 0; j < width; j++) {
					System.out.print("+ ");
				}

			} else {
				for (int j = 0; j < width; j++) {
					if (j != 0 && j < width - 1) {
						System.out.print("  ");
					} else {
						System.out.print("+ ");
					}
				}
			}
			System.out.println();
		}
	}
}