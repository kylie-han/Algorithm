import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2156_포도주시식_Main {
	static int N, ans;
	static int[] wine, memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		wine = new int[N];
		memo = new int[N];
		for (int i = 0; i < N; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		memo[0] = wine[0];
		if (N > 1) {
			memo[1] = wine[1] + memo[0];
		}
		if (N > 2) {
			memo[2] = Math.max(wine[0] + wine[2], wine[1] + wine[2]);
			memo[2] = Math.max(memo[1], memo[2]);
			for (int i = 3; i < N; i++) {
				memo[i] = Math.max(memo[i - 2] + wine[i], memo[i - 3] + wine[i - 1] + wine[i]);
				memo[i] = Math.max(memo[i], memo[i - 1]);
			}

		} 
		ans = memo[N - 1];
		System.out.println(ans);
	}
}
