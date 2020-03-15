package com.ssafy.step01.recursive;

import java.util.Arrays;
import java.util.Scanner;

public class R03_fiboMemoTest {
	
	static long[] call1, call2, memo;
	static long totalCnt1, totalCnt2;
	// f(n) : n번째 항
	// f(n) = f(n-1) + f(n-2)
	private static long fibo(int n) {	// 메모하지 않음
		++call1[n];
		++totalCnt1;
		// basis rule
		if (n <= 1) return n;
		// recursive rule
		return fibo(n-1) + fibo(n-2);
	}
	private static long fibo2(int n) {	// 메모함
		++call2[n];
		++totalCnt2;
		// basis rule
		if (n <= 1) return n;
		// recursive rule
		// n항의 값을 계산한 적이 있었다면(메모확인) 메모된 값 리턴
		if (memo[n] != 0) return memo[n];
		return memo[n] = fibo2(n-1) + fibo2(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		call1 = new long[N+1];
		System.out.println(fibo(N));
		System.out.println(Arrays.toString(call1));
		System.out.println(totalCnt1);
		call2 = new long[N+1];
		memo = new long[N+1];
		System.out.println(fibo2(N));
		System.out.println(Arrays.toString(call2));
		System.out.println(totalCnt2);
		System.out.println(Arrays.toString(memo));
		sc.close();
	}//end of main
}//end of class
/**
 * 
 * 
 */
