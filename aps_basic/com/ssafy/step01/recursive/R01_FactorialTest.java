package com.ssafy.step01.recursive;

import java.util.Scanner;

public class R01_FactorialTest {
	
	// n! : n*(n-1)!
	
	// n! 계산
	private static long factorial(int n) {
		// 기저(재귀탈출) 파트
		if(n==1) return 1;
		// 유도(파생) 파트
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));
		sc.close();
	}//end of main
}//end of class
/**
 * 재귀함수로 구현한 factorial
 * 빅오 시간복잡도 : O(N)
 */