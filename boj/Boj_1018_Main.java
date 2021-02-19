import java.util.Scanner;

public class Boj_1018_Main {
	static int N,M,ans;
	static boolean[][] board;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		ans = 64;
		board = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				board[i][j] = str.charAt(j) == 'W'?false:true;
			}
		}
		for (int i = 0; i <= board.length-8; i++) {
			for (int j = 0; j <= board[i].length-8; j++) {
				find(i,j);
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	private static void find(int n, int m) {
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println();
				if((i+j)%2 == 0 && !(board[n][m]^board[n+i][m+j]));
				else if((i+j)%2 == 1 && board[n][m]^board[n+i][m+j]);
				else {
					cnt++;
				}
			}
		}
		cnt = cnt>32? 64-cnt : cnt;
		ans = ans>cnt? cnt : ans;
	}
}
