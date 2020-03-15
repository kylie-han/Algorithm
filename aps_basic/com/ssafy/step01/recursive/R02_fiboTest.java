package com.ssafy.step01.recursive;

import java.util.Scanner;

public class R02_fiboTest {
	
	// f(n) : n¹øÂ° Ç×
	// f(n) = f(n-1) + f(n-2)
	private static long fibo(int n) {
		// basis rule
		if (n <= 1) return n;
		// recursive rule
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibo(N));
		sc.close();
	}//end of main
}//end of class
/**
 * 
 * 
 */
