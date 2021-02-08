import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_2565_ภüฑ๊มู_Main {
	static int N,ans;
	static int[][] power;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		power = new int[N][2];
		for (int i = 0; i < power.length; i++) {
			st = new StringTokenizer(br.readLine());
			power[i][0] = Integer.parseInt(st.nextToken());
			power[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(power,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		dp = new int[N];
		dp[0] = 1;
		ans = dp[0];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i;j++) {
				if(power[j][1] < power[i][1] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j]+1;
					ans = dp[i] > ans ? dp[i] : ans;
				}
			}
		}
		System.out.println(N-ans);
	}
}
