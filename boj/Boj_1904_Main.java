import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1904_Main {
	static int N;
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		for (int i = 1; i < dp.length; i++) {
			if(i == 1) dp[i] = 1;
			else if(i == 2) dp[i] = 2;
			else {
				dp[i] = (dp[i-1]+dp[i-2])%15746;
			}
		}
		System.out.println(dp[N]);
	}
}
