package com.ssafy.java;

public class AlpaTest2 {

	public static void main(String[] args) {
		char a = 'A';
		for(int y=1; y<=5; y++) {
			for(int z=5; z>=1; z--) {
				System.out.print(" ");
				if(y == z) break;
				System.out.print(" ");
			}
			for(int x=1; x<=5; x++) {
				System.out.print(a++);
				if(y == x) break;
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
