package com.java.first;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i_a = sc.nextInt();
		int i_b = sc.nextInt();
		System.out.printf("°ö=%d\n",i_a*i_b);
		System.out.printf("¸ò=%d\n",i_a/i_b);
	}
}
