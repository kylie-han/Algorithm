/**

[입력 예]
3
6 6 2//배열의 크기인 Y, X 참가자 수(N)
34 42 22 32 21 24//Y*X의 숫자판 
22 32 21 33 33 33
13 11 12 21 43 13
34 23 22 24 32 11
22 24 21 41 41 42
31 42 34 32 15 32
2 3 2//참가자의 시작위치 행, 열, 횟수
2 6 6//참가자의 시작위치 행, 열, 횟수
3 3 4 4 2 6 5//함정 수, 함정의 좌표 * 수
////////////////////////
2 2 3
11 21
41 31
1 1 2
2 1 2
1 2 1
1 2 2
//////////////
5 6 2
22 32 21 33 33 33
13 11 12 21 43 13
34 23 22 24 32 11
22 24 21 41 41 42
31 42 34 32 15 32
5 4 2
1 3 1
2 3 4 4 2

[출력 예]
#1 2300
#2 -900
#3 1500

 */

package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class wsjava04_12반_한지혜 {
	public static void main(String[] args) {
		int[] row = {0,0,1,0,-1};
		int[] col = {0,1,0,-1,0};
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			//배열크기
			int y = sc.nextInt();
			int x = sc.nextInt();
			//참가자 수
			int n = sc.nextInt();
			//배열 입력
			int[][] a = new int[y+2][x+2];
			for (int i = 1; i < a.length-1; i++) {
				for (int j = 1; j < a[i].length-1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int[] st_row = new int[n];
			int[] st_col = new int[n];
			int[] st_t = new int[n];
			for (int i = 0; i < n; i++) {
				//참가자의 시작위치
				st_row[i] = sc.nextInt();
				st_col[i] = sc.nextInt();
				st_t[i] = sc.nextInt();
			}
			int trap = sc.nextInt();
			for (int i = 0; i < trap; i++) {
				int trap_row = sc.nextInt();
				int trap_col = sc.nextInt();
				a[trap_row][trap_col] = 0;
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(Arrays.toString(a[i]));
			}
			//횟수만큼 반복
			int reward = 0;
			for (int j = 0; j < n; j++) {
				reward -= 1000;
				while(st_t[j]>0) {
					//참가자의 시작위치의 값을 받아 xx/10=방향으로 xx%10=칸 점프한다.
					int b = a[st_row[j]][st_col[j]]/10;
					int k = a[st_row[j]][st_col[j]]%10;
					st_row[j] += row[b]*k;
					st_col[j] += col[b]*k;
					st_t[j]--;
					if(a[st_row[j]][st_col[j]]==0) {
						break;
					}
				}
				//마지막 위치의 값*100을 reward로 받는다.
				reward += 100*a[st_row[j]][st_col[j]];				
			}
			
			
			System.out.println("#"+testCase+" "+reward);
		}//end of for tc
	}//end of main
}//end of class





























