package com.sourseit.hometask3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int a[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(a.length);
		}
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] * 2;
		}
		int c[] = new int[2 * a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}
}
