package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기중 하나를 고르세요");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//입력한 번호
		int TC = 0;
		if(a == 1) TC = 5;
		else if (a==2) TC = 3;
		else if (a==3) TC = 1;
		
		int win = 0;
		int lose = 0;
		for (int testCase = 0; testCase < TC; testCase++) {
			int com = (int)(Math.random()*3)+1; 
			System.out.print("가위바위보 중 하나 입력 :");
			String hand = sc.next();
			int han = 0;
			if(hand.equals("가위")) han = 1;
			else if(hand.equals("바위")) han = 2;
			else if(hand.equals("보")) han = 3;
			//
			if(com==han) {
				System.out.println("비겼습니다");
			}else if(com > han) {
				System.out.println("졌습니다ㅠ");
				lose++;
			}else if(com < han) {
				System.out.println("이겼습니다!!");
				win++;
			}
			if(lose>=3 || win>=3) break;
		}
		if(win>TC/2) System.out.println("###사용자 승!!");
		else if(win==lose) System.out.println("###비김");
		else System.out.println("###컴퓨터 승!!");
	}
}
