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
