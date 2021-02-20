import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11049_Main {
    static Matrix[] arr;
    static Matrix[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new Matrix[N + 1];
        dp = new Matrix[N + 1][N + 1];
        for (int i = 1; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[i] = new Matrix(0, r, c);
        }
        System.out.println(dp(1, N).sum);
    }

    private static Matrix dp(int i, int j) {
        if (dp[i][j] != null)
            return dp[i][j];
        if (i == j) {
            dp[i][j] = new Matrix(0, arr[i].r, arr[i].c);
            return dp[i][j];
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int r = 0;
        int c = 0;
        for (int k = i; k < j; k++) {
            Matrix tmp1 = dp(i, k);
            Matrix tmp2 = dp(k + 1, j);
            if (tmp1.sum + tmp2.sum < min) {
                min = tmp1.sum + tmp2.sum;
                r = tmp1.r;
                c = tmp2.c;
                sum = tmp1.r * tmp1.c * tmp2.c;
            }
        }
        sum += min;
        dp[i][j] = new Matrix(sum, r, c);
        return dp[i][j];
    }
}

class Matrix {
    int sum;
    int r;
    int c;

    public Matrix(int sum, int r, int c) {
        this.sum = sum;
        this.r = r;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Matrix [c=" + c + ", r=" + r + ", sum=" + sum + "]";
    }

}
