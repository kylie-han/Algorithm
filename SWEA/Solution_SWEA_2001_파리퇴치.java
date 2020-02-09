import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_2001_ÆÄ¸®ÅðÄ¡ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] space = new int[n][n];
			for (int i = 0; i < space.length; i++) {
				for (int j = 0; j < space[i].length; j++) {
					space[i][j] = sc.nextInt();
				}
			}
//			for (int i = 0; i < space.length; i++) {
//				for (int j = 0; j < space[i].length; j++) {
//					System.out.printf("%2d ",space[i][j]);
//				}
//				System.out.println();
//			}
			int deadMax = 0;
//			int[] idx = {0,0};
			for (int i = 0; i <= space.length-m; i++) {
				for (int j = 0; j <= space[i].length-m; j++) {
					int dead = 0;
					for (int j2 = 0; j2 < m; j2++) {
						for (int k = 0; k < m; k++) {
							dead += space[i+j2][j+k];
						}
					}
					if(dead>= deadMax) {
						deadMax = dead;
//						idx[0] = i;
//						idx[1] = j;
					}
				}
			}
			System.out.println("#"+testCase+" "+deadMax);
		}
	}//end of main
}//end of class
