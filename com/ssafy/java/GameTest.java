package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�. �Ʒ� ������ �ϳ��� ������");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//�Է��� ��ȣ
		int TC = 0;
		if(a == 1) TC = 5;
		else if (a==2) TC = 3;
		else if (a==3) TC = 1;
		
		int win = 0;
		int lose = 0;
		for (int testCase = 0; testCase < TC; testCase++) {
			int com = (int)(Math.random()*3)+1; 
			System.out.print("���������� �� �ϳ� �Է� :");
			String hand = sc.next();
			int han = 0;
			if(hand.equals("����")) han = 1;
			else if(hand.equals("����")) han = 2;
			else if(hand.equals("��")) han = 3;
			//
			if(com==han) {
				System.out.println("�����ϴ�");
			}else if(com > han) {
				System.out.println("�����ϴ٤�");
				lose++;
			}else if(com < han) {
				System.out.println("�̰���ϴ�!!");
				win++;
			}
			if(lose>=3 || win>=3) break;
		}
		if(win>TC/2) System.out.println("###����� ��!!");
		else if(win==lose) System.out.println("###���");
		else System.out.println("###��ǻ�� ��!!");
	}
}
