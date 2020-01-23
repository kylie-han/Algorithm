package com.ssafy.java;

import java.util.Arrays;

public class ArrayTest {
	int[] list = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
	public void print() {
		for (int i = 0; i < list.length; i++) {
		System.out.print(list[i]+" ");	
		}
		System.out.println();
	}
	public void total() {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		System.out.println("배열의 합 : "+sum);
	}
	public void average() {
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
			cnt++;
		}
		System.out.println("배열의 평균 : "+sum/cnt);
	}
	public void minimun() {
		Arrays.sort(list);
		System.out.println("배열의 최소값 : "+list[0]);
	}
	public void selectionSort() {
		
	}
	
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		at.print();
		at.total();
		at.average();
		at.minimun();
	}
}
