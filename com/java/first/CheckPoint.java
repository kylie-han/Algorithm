package com.java.first;

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int over = weight+100-height;
		System.out.printf("비만수치는 %d입니다.\n",over);
		if(over > 0) System.out.println("당신은 비만이군요");
	}
}
