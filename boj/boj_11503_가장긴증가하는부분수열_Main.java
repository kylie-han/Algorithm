import java.util.Scanner;

public class boj_11503_가장긴증가하는부분수열_Main {
	static int N,max,ans;
	static int[] arr,dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		dp = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = 1;
		max = dp[0];
		for (int i = 1; i < arr.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j] +1;
				}
				max = Math.max(max, dp[i]);
			}
		}
		ans = max;
		System.out.println(max);
	}
}
