import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9461_파도반수열_Main {
	static int TC, N;
	static long[] memo;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TC = Integer.parseInt(br.readLine());
		memo = new long[101];
		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		memo[5] = 2;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < TC; i++) {
			N = Integer.parseInt(br.readLine());
			sb.append(dp(N)+ "\n");
		}
		System.out.print(sb.toString());
	}
	private static long dp(int N) {
		if(memo[N] == 0) {
			memo[N] = dp(N-1)+dp(N-5);
		}
		return memo[N];
	}
}
