import java.util.Arrays;
import java.util.Scanner;

public class boj_1389_케빈베이컨의6단계법칙_Main {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int E = sc.nextInt();
		int[][] D = new int[N][N];
		for (int i = 0; i < D.length; i++) {
			Arrays.fill(D[i], M);
		}
		for (int i = 0; i < E; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			D[x][y] = 1;
			D[y][x] = 1;
		}
		for (int k = 0; k < D.length; k++) {
			for (int i = 0; i < D.length; i++) {
				if (k == i) continue;
				for (int j = 0; j < D.length; j++) {
					if (j == k || i == j) continue;
					if (D[i][k] != M && D[k][j] != M &&
							D[i][j] > D[i][k] + D[k][j])
						D[i][j] = D[i][k] + D[k][j];
				}
			}
		}
		int min = M;
		int idx = 0;
		for (int i = 0; i < D.length; i++) {
			int sum = 0;
			for (int j = 0; j < D.length; j++) {
				if (D[i][j] == M) continue;
				sum += D[i][j];
			}
			if (min > sum) {
				min = sum;
				idx = i;
			}
		}
		System.out.println(idx+1);
	}
}
