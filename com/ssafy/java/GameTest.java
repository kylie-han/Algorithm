package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		System.out.println("亜是郊是左 惟績聖 獣拙杯艦陥. 焼掘 左奄掻 馬蟹研 壱牽室推");
		System.out.println("1. 5毒 3渋");
		System.out.println("2. 3毒 2渋");
		System.out.println("3. 1毒 1渋");
		System.out.print("腰硲研 脊径馬室推 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//脊径廃 腰硲
		int TC = 0;
		if(a == 1) TC = 5;
		else if (a==2) TC = 3;
		else if (a==3) TC = 1;
		
		int win = 0;
		int lose = 0;
		for (int testCase = 0; testCase < TC; testCase++) {
			int com = (int)(Math.random()*3)+1; 
			System.out.println(com);
			System.out.print("亜是郊是左 掻 馬蟹 脊径 :");
			String hand = sc.next();
			int han = 0;
			if(hand.equals("亜是")) han = 1;
			else if(hand.equals("郊是")) han = 2;
			else if(hand.equals("左")) han = 3;
			//
			if(com==han) {
				System.out.println("搾医柔艦陥");
			}else if (com == 3 && han == 1) {
				System.out.println("戚医柔艦陥!!!!!!!!");
				lose++;
			}else if (han == 3 && com == 1) {
				System.out.println("然柔艦陥ばばばばばばばばばばば");
				win++;
			}else if(com > han&&(han != 3 && com != 1)) {
				System.out.println("然柔艦陥ば");
				lose++;
			}else if(com < han&&(com != 3 && han != 1)) {
				System.out.println("戚医柔艦陥!!");
				win++;
			}
			if(lose>=3 || win>=3) break;
		}
		if(win>TC/2) System.out.println("###紫遂切 渋!!");
		else if(win==lose) System.out.println("###搾沿");
		else System.out.println("###陳濃斗 渋!!");
	}
}
