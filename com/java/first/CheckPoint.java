package com.java.first;

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int over = weight+100-height;
		System.out.printf("�񸸼�ġ�� %d�Դϴ�.\n",over);
		if(over > 0) System.out.println("����� ���̱���");
	}
}
