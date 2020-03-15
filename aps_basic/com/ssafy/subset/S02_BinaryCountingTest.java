package com.ssafy.subset;

import java.util.Scanner;

public class S02_BinaryCountingTest {
	static int N, totalCnt;
	static char[] input;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		input = new char[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.next().charAt(0);
		}
		totalCnt = 1<<N;
		generateSubset(totalCnt);
		System.out.println("totalCnt : "+totalCnt);
		sc.close();
	}//end of main

	private static void generateSubset(int caseCnt) {
		
		for (int flag = 0; flag < caseCnt; flag++) {
			//flag 비트열 별로 원소 수만큼 각 자리의 비트를 확인
			for (int i = 0; i < N; i++) {
				System.out.print((flag & 1<<i) != 0?input[i]+"\t":"X"+"\t");
			}
			System.out.println();
		}
		
	}//end of method

}//end of class
