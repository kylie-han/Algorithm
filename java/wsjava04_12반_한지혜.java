/**

[�Է� ��]
3
6 6 2//�迭�� ũ���� Y, X ������ ��(N)
34 42 22 32 21 24//Y*X�� ������ 
22 32 21 33 33 33
13 11 12 21 43 13
34 23 22 24 32 11
22 24 21 41 41 42
31 42 34 32 15 32
2 3 2//�������� ������ġ ��, ��, Ƚ��
2 6 6//�������� ������ġ ��, ��, Ƚ��
3 3 4 4 2 6 5//���� ��, ������ ��ǥ * ��
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

[��� ��]
#1 2300
#2 -900
#3 1500

 */

package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class wsjava04_12��_������ {
	public static void main(String[] args) {
		int[] row = {0,0,1,0,-1};
		int[] col = {0,1,0,-1,0};
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			//�迭ũ��
			int y = sc.nextInt();
			int x = sc.nextInt();
			//������ ��
			int n = sc.nextInt();
			//�迭 �Է�
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
				//�������� ������ġ
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
			//Ƚ����ŭ �ݺ�
			int reward = 0;
			for (int j = 0; j < n; j++) {
				reward -= 1000;
				while(st_t[j]>0) {
					//�������� ������ġ�� ���� �޾� xx/10=�������� xx%10=ĭ �����Ѵ�.
					int b = a[st_row[j]][st_col[j]]/10;
					int k = a[st_row[j]][st_col[j]]%10;
					st_row[j] += row[b]*k;
					st_col[j] += col[b]*k;
					st_t[j]--;
					if(a[st_row[j]][st_col[j]]==0) {
						break;
					}
				}
				//������ ��ġ�� ��*100�� reward�� �޴´�.
				reward += 100*a[st_row[j]][st_col[j]];				
			}
			
			
			System.out.println("#"+testCase+" "+reward);
		}//end of for tc
	}//end of main
}//end of class





























