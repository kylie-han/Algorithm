/**
 
 [입력 예]
3
9 5
6 2 4
1 5 2
0 0 4
6 6 1
2 4 3
11 6
0 0 4
6 0 1
2 4 3
4 2 4
1 5 2
10 8 1
7 5
5 2 1
1 6 2
0 6 3
1 0 2
2 4 4

[출력 예]
#1 3
#2 4
#3 1
 */


package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class hwjava02_12반_한지혜 {
	public static void main(String[] args) {
		
		int[] row = {0,-1,1,0,0};
		int[] col = {0,0,0,-1,1};
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			int[][] pond = new int[n][n];
			int population = sc.nextInt();
			int live = population;
			for (int i = 1; i <= population; i++) {
				int s_row = sc.nextInt();//행
				int s_col = sc.nextInt();//열
				int s_vec = sc.nextInt();//방향
//				pond[s_row][s_col] = i;
				for (int j = 3; j > 0; j--) {
					//연못에서 소금쟁이 자리에서 3or2or1칸을 이동했을 때 먼저 뛴 다른 소금쟁이가 있거나 배열밖으로 나가면 live--
					s_row+=row[s_vec]*j;
					s_col+=col[s_vec]*j;
					if(s_row<0||s_col<0||s_row>=n||s_col>=n) {
						live--;
						break;
					}else if(pond[s_row][s_col] !=0) {
						live--;
						break;
					}else {
					//없으면 원래 위치에 0입력, 이동한 위치에 소금쟁이 번호 체크
						if(j==1)pond[s_row][s_col] = i;
					}
				}
			}
			for (int i = 0; i < pond.length; i++) {
				System.out.println(Arrays.toString(pond[i]));
			}
			System.out.println("#"+testCase+" "+live);
		}//end of for tc
	}//end of main
}//end of class
