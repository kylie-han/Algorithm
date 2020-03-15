package com.ssafy.subset;

import java.util.Scanner;

public class S01_BasicTest {
	static int N, totalCnt;
	static int[] input;
	static boolean[] isSelected;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		generateSubset(0);
		System.out.println("totalCnt : "+totalCnt);
		sc.close();
	}
	private static void generateSubset(int cnt) {
		if (cnt ==N) {
			++totalCnt;
			for (int i = 0; i < N; i++) {
				System.out.print(isSelected[i]?input[i]+"\t":"X"+"\t");
			}
			System.out.println();
			return;
		}
		//�κ����տ� ���� ���Ҹ� ����
		isSelected[cnt] = true;
		generateSubset(cnt+1);
		
		//�κ����տ� ������Ҹ� ����
		isSelected[cnt] = false;
		generateSubset(cnt+1);
		
	}
}
