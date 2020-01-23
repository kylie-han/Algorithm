package com.ssafy.java;

public class AlpaTest2 {
	public static void main(String[] args) {
		char a = 'A';
		for (int i = 0; i <5 ; i++) {
			for (int j = 4; j > 0; j--) {
				if (i==j) break;
				System.out.print("  ");
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(a+" ");
				a++;
				if (i==j) break;
			}
			System.out.println();
		}
	}//main
}//class