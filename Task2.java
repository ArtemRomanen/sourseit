package com.sourseit.hometask3;

public class Task2 {

	public static void main(String[] args) {
		boolean isSimple = false;

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isSimple = false;
					break;
				}
			}
			if (isSimple) {
				System.out.println(i);
			} else {
				isSimple = true;
			}
		}
	}
}