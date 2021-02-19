import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1010_Main {
	static int T,N,M,ans;
	static int[][] comb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			comb = new int[M+1][M+1];
			for (int j = 0; j < comb.length; j++) {
				comb[j][j] = 1;
				comb[j][0] = 1;
				for (int k = 1; k < j; k++) {
					comb[j][k] = comb[j-1][k-1] + comb[j-1][k];
				}
			}
			ans = comb[M][N];
			System.out.println(ans);
		}
	}
}
