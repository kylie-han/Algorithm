package com.ssafy.java;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[6];//6�� �迭
		for (int i = 0; i < arr.length; i++) {//�迭�� �� 6�� ����
			int x = rand.nextInt(45)+1;//������ �߻�
			if (i==0) arr[i] =x;
			for (int j = 0; j < i; j++) {//�迭�� ù��°���� ���� arr[i]���� üũ�ؼ� 
				if(x != arr[j]) arr[i] = x;//���� �� ������ ����
				else if (x==arr[j]){	//���� �������� �ٽ� 
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}//main
}//class
