import java.util.Scanner;

public class Solution_SWEA_2005_ÆÄ½ºÄ®ÀÇ»ï°¢Çü_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			int[][] out = new int[n][n];
			System.out.println("#" + testCase);
			for (int i = 0; i < out.length; i++) {
				for (int j = 0; j <= i; j++) {
					if(j==0||j==i) out[i][j] = 1;
					else out[i][j] = out[i-1][j-1] + out[i-1][j];
					System.out.print(out[i][j] + " ");
				}
				System.out.println();
			}
		}
	}//end of main
}//end of class
