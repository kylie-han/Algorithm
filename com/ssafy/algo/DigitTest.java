/**
�Էµ� ���ڸ����� �����ڸ����� �з�, ��������
[�Է�]
11 22 55 44 88 66 55 99 55 44 22 55 11 0 
[���]
1 : 2��
2 : 2��
4 : 2��
5 : 4��
6 : 1��
8 : 1��
9 : 1��

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
				System.out.println(i+" : "+arr[i]+"��");
			}
		}//end of for:��´�
	}//end of main
}//end of class
