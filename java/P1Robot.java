import java.util.Scanner;

/**

3
6
S A S S W S
S W A S C S
S W S W S S
S W S S W S
S B S S W S
S S S S S S

*/
public class 로봇이동거리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			char[][] a = new char[n][n];
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = sc.next().charAt(0);
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(a[i][j] == 'A') {
						count += checkRight(a,i,j);
					}
					else if(a[i][j] == 'B') {
						count += checkRight(a,i,j);
						count += checkLeft(a,i,j);;
					}
					else if(a[i][j] == 'C') {
						count += checkRight(a,i,j);
						count += checkLeft(a,i,j);;
						count += checkUp(a,i,j);;
						count += checkDown(a,i,j);;
					}
				}
			}
			System.out.println("#"+testCase+" "+count);
		}//end of for tc
	}//end of main

	public static int checkDown(char[][] a, int row, int col) {
		int cnt = 0;
		for (int i = 1; i < a.length-row; i++) {
			if (a[row+i][col] == 'S') cnt++;
			else break;
		}
		return cnt;
		
	}

	public static int checkUp(char[][] a, int row, int col) {
		int cnt = 0;
		for (int i = row-1; i >= 0; i--) {
			if (a[i][col] == 'S') cnt++;
			else break;
		}
		return cnt; 
		}

	public static int checkLeft(char[][] a, int row, int col) {
		int cnt = 0;
		for (int i = col-1; i >= 0; i--) {
			if (a[row][i] == 'S') cnt++;
			else break;
		}
		return cnt;
	}

	public static int checkRight(char[][] a, int row, int col) {
		int cnt = 0;
		for (int i = 1; i < a.length-col; i++) {
			if (a[row][col+i] == 'S') cnt++;
			else break;
		}
		return cnt;
		
	}
	
}//end of class
