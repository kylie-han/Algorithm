import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10844_쉬운계단수_Main {
	static int[][] dp = new int[10001][10];
	static int N,ans;
	final static int share = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for (int i = 1; i < N+1; i++) {
			if(i == 1) {
				for (int j = 1; j < dp[0].length; j++) {
					dp[i][j] = 1;
				}
			}else {
				dp[i][0] = dp[i-1][1];
				for (int j = 1; j < 9; j++) {
					dp[i][j] = (dp[i-1][j-1]%share + dp[i-1][j+1]%share)%share;
				}
				dp[i][9] = dp[i-1][8];
			}
		}
		ans = 0;
		for (int i = 0; i < dp[N].length; i++) {
			ans = (ans%share + dp[N][i]%share)%share;
		}
		System.out.println(ans);
	}
}
