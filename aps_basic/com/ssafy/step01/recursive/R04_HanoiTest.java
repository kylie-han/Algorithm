package com.ssafy.step01.recursive;

import java.util.Scanner;

public class R04_HanoiTest {
	static StringBuilder result = new StringBuilder();
	private static void hanoi(int cnt, int from, int temp, int to) {
		//basis
		if (cnt == 0) return;
		
		//recursive
		// ���� ����� cnt -1 ��� ������ �ӽñ������ �ű�
		hanoi(cnt-1, from, to, temp);
		// ���� ����� cnt���� ����������� �ű�
		result.append(cnt+ " : "+from+"->"+to+"\n");
		// �ӽ� ����� cnt-1��� ������ ����������� �ű�
		hanoi(cnt-1, temp, from, to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		hanoi(N, 1, 2, 3);
		System.out.println(result.toString());
		sc.close();
	}
}
