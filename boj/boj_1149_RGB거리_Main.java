import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1149_RGB°Å¸®_Main {
	static int N;
	static int[][] rgb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		N = Integer.parseInt(st.nextToken());
		rgb = new int[N][3];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = Integer.parseInt(st.nextToken());
				if(i!=0) {
					switch (j) {
					case 0:
						rgb[i][j] += Math.min(rgb[i-1][1], rgb[i-1][2]);
						break;
					case 1:
						rgb[i][j] += Math.min(rgb[i-1][0], rgb[i-1][2]);
						break;
					case 2:
						rgb[i][j] += Math.min(rgb[i-1][0], rgb[i-1][1]);
						break;
					default:
						break;
					}
				}
			}
		}
		int ans = Math.min(rgb[N-1][0], Math.min(rgb[N-1][1], rgb[N-1][2]));
		System.out.println(ans);
		
	}
}
