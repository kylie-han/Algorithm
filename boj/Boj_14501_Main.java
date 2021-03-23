import java.util.Arrays;
import java.util.Scanner;

public class Boj_14501_Main {
    static int N, ans;
    static int[][] TP;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        TP = new int[N][2];
        dp = new int[N];
        for (int i = 0; i < TP.length; i++) {
            TP[i][0] = sc.nextInt();
            TP[i][1] = sc.nextInt();
            // System.out.println(Arrays.toString(TP[i]));
        }
        ans = 0;
        for (int i = dp.length-1; i >= 0; i--) {
            if(TP[i][0] + i >N){
                dp[i] = 0;
            }else if(TP[i][0] + i == N){
                dp[i] = TP[i][1];
            }else{
                dp[i] = TP[i][1]+dp[i+TP[i][0]];
            }
            if(dp[i] > ans){
                ans = dp[i];
            }else{
                dp[i] = ans;
            }
        }
        System.out.println(ans);
    }
}
