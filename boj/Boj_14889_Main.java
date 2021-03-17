import java.util.Arrays;
import java.util.Scanner;

public class Boj_14889_Main {
    static int N, min;
    static int[][] S;
    static boolean[] teamA;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new int[N][N];
        teamA = new boolean[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();   
            }
            // System.out.println(Arrays.toString(S[i]));
        }
        // int[] temp2 = {3,4,5};
        // System.out.println(perm(temp2));
        min = Integer.MAX_VALUE;
        combination(N/2,0);
        System.out.println(min);
    }
    private static void combination(int depth, int start) {
        if(depth == 0){
            // System.out.println(Arrays.toString(teamA));
            int[] A = new int[N/2];
            int[] B = new int[N/2];
            int idxA = 0;
            int idxB = 0;
            for (int i = 0; i < teamA.length; i++) {
                if(teamA[i]){
                    A[idxA++] = i;
                }else {
                    B[idxB++] = i;
                }
                // System.out.println(Arrays.toString(A));
                // System.out.println(Arrays.toString(B));
            }
            // System.out.println(perm(A));
            // System.out.println(perm(B));
            min = Math.min(Math.abs(perm(A)-perm(B)),min);
            return;
        }
        for (int i = start; i < S.length; i++) {
            if(teamA[i]) continue;
            teamA[i] = true;
            combination(depth-1, i+1);
            teamA[i] = false;
        }
    }
    private static int perm(int[] team) {
        int sum = 0;
        for (int i = 0; i < team.length; i++) {
            for (int j = i+1; j < team.length; j++) {
                sum += S[team[i]][team[j]]+S[team[j]][team[i]];
            }
        }
        return sum;
    }
}
