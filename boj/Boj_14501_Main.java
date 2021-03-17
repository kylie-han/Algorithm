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
            System.out.println(Arrays.toString(TP));
        }
    }
}
