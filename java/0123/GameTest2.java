package com.ssafy.java;

import java.util.Scanner;

public class GameTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menuNo = 0, loopCount = 0, winCount = 0;

		do {
			System.out.println(">>>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
			System.out.println("1. 5�� 3��");
			System.out.println("2. 3�� 2��");
			System.out.println("3. 1�� 1��");
			System.out.print("��ȣ�� �Է��ϼ���.");

			menuNo = scan.nextInt();
			if(menuNo == 1) {
				loopCount = 5;
				winCount = 3;
			} else if(menuNo == 2) {
				loopCount = 3;
				winCount = 2;
			} else if(menuNo == 3) {
				loopCount = 1;
				winCount = 1;
			} else {
				System.out.println("wrong number !!!");
			}
		} while(loopCount == 0);

		String inputData = "";
		int comSelect = 0, comWin = 0, userWin = 0;
		for(int a=0; a<loopCount; a++) {
			comSelect = (int)(Math.random() * 3) + 1;
			System.out.print(comSelect+"���������� �� �ϳ� �Է� : ");
			inputData = scan.next();
			if(inputData.equals("����") && comSelect == 2) {
				System.out.println("�����ϴ�!!!");
				comWin++;
			} else if(inputData.equals("����") && comSelect == 3) {
				System.out.println("�̰���ϴ�!!!");
				userWin++;
			} else if(inputData.equals("����") && comSelect == 3) {
				System.out.println("�����ϴ�!!!");
				comWin++;
			} else if(inputData.equals("����") && comSelect == 1) {
				System.out.println("�̰���ϴ�!!!");
				userWin++;
			} else if(inputData.equals("��") && comSelect == 1) {
				System.out.println("�����ϴ�!!!");
				comWin++;
			} else if(inputData.equals("��") && comSelect == 2) {
				System.out.println("�̰���ϴ�!!!");
				userWin++;
			} else {
				System.out.println("�����ϴ�!!!");
			}
		}//for
		if(comWin > userWin) {
			System.out.println("###��ǻ�� ��!!!");
		} else if(comWin < userWin) {
			System.out.println("###����� ��!!!");
		} else {
			System.out.println("###�����ϴ�!!!");
		}
	}//main

}
