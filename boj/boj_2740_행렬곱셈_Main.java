import java.util.Arrays;
import java.util.Scanner;

public class boj_2740_Çà·Ä°ö¼À_Main {
	static int N,M,K;
	static int[][] A,B,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		A = new int[N][M];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		M = sc.nextInt();
		K = sc.nextInt();
		B = new int[M][K];
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		ans = new int[N][K];
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < K; k++) {
				for (int j = 0; j < M; j++) {
					ans[i][k] += A[i][j] * B[j][k];
				}
				System.out.print(ans[i][k] + " ");
			}
			System.out.println();
		}
	}
}
