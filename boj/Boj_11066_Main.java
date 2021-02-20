import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11066_Main {
    static int T, N;
    static int[] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = new int[N + 1];
            dp = new int[N + 1][N + 1];
            st = new StringTokenizer(br.readLine().trim());
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(dp(1, N));
        }
        br.close();
    }

    private static int dp(int i, int j) {
        if (i == j || dp[i][j] != 0) {
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int tmp = dp(i, k) + dp(k + 1, j);
            min = min < tmp ? min : tmp;
        }
        int sum = 0;
        for (int l = i; l <= j; l++) {
            sum += arr[l];
        }
        dp[i][j] = min + sum;
        return min + sum;
    }
}
