/**
입력된 두자리수의 십의자리별로 분류, 개수세기
[입력]
11 22 55 44 88 66 55 99 55 44 22 55 11 0 
[출력]
1 : 2개
2 : 2개
4 : 2개
5 : 4개
6 : 1개
8 : 1개
9 : 1개

 */
package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		while(true) {
			int inData = sc.nextInt();
			if(inData == 0) break;
			arr[inData/10]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(i+" : "+arr[i]+"개");
			}
		}//end of for:출력단
	}//end of main
}//end of class
