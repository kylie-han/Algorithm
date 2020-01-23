package com.ssafy.java;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[6];//6개 배열
		for (int i = 0; i < arr.length; i++) {//배열에 값 6개 저장
			int x = rand.nextInt(45)+1;//랜덤값 발생
			if (i==0) arr[i] =x;
			for (int j = 0; j < i; j++) {//배열의 첫번째부터 지금 arr[i]까지 체크해서 
				if(x != arr[j]) arr[i] = x;//같은 값 없으면 저장
				else if (x==arr[j]){	//같은 값있으면 다시 
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}//main
}//class
