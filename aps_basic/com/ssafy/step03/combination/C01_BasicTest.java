package com.ssafy.step03.combination;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 현재 처리하고 있는 다음 녀석부터 볼것이기 때문에 방문체크해야 할 배열은 필요가 없다.
 * @author jh han
 *
 */
public class C01_BasicTest {
	static int N, R;
	static int[] input, number;
	static int totalCnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		input = new int[N];
		number = new int[R];
		
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		
		combination(0, 0);
		System.out.println("총 경우의 수 : "+totalCnt);
		sc.close();
	}
	
	//현재 위치에 조합할 수 선택
	private static void combination(int cnt, int cur) {
		if (cnt == R) {
			totalCnt++;
			System.out.println(Arrays.toString(number));
			return;
		}else {
			for (int i = cur; i < N; i++) {
				number[cnt] = input[i];
				combination(cnt + 1, i + 1);
			} 
		}
	}
}
