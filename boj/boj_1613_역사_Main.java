import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1613_¿ª»ç_Main {
	public static void main(String[] args) throws IOException {
		final int M = Integer.MAX_VALUE;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] D = new int[n][n];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			D[x][y] = 1;
		}
		for (int l = 0; l< D.length; l++) {
			for (int i = 0; i < D.length; i++) {
				if (l == i) continue;
				for (int j = 0; j < D.length; j++) {
					if (i == j || l == j) continue;
					if (D[i][l] == 1 && D[l][j] == 1)
						D[i][j] = 1;
				}
			}
		}
		int s = Integer.parseInt(br.readLine());
		for (int i = 0; i < s; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			if (D[x][y] == 1) System.out.println(-1);
			else if (D[y][x] == 1) System.out.println(1);
			else System.out.println(0);
		}
	}
}
