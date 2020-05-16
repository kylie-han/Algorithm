import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2458_Å°¼ø¼­_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] D = new int[N][N];
		final int max = Integer.MAX_VALUE;
		for (int i = 0; i < D.length; i++) {
			Arrays.fill(D[i], max);
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			D[x][y] = 1;
			D[y][x] = 2;
		}
		for (int k = 0; k < D.length; k++) {
			for (int i = 0; i < D.length; i++) {
				if (k == i) continue;
				for (int j = 0; j < D.length; j++) {
					if (i == j || k == j)continue;
					if (D[i][k] == 1 && D[k][j] == 1 &&
							D[i][j] > D[i][k] + D[k][j]) {
						D[i][j] = 1;
						D[j][i] = 2;
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < D.length; i++) {
			int cnt = 0;
			for (int j = 0; j < D.length; j++) {
				if (i == j) continue;
				if (D[i][j] == max) cnt++;
			}
			if (cnt == 0) ans++;
		}
		System.out.println(ans);
	}
}
