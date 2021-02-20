import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1932_Main {
	static int N;
	static int[][] tri;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		tri = new int[N+2][N+2];
		StringTokenizer st;
		for (int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 1; j < i+1; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());
				tri[i][j] += Math.max(tri[i-1][j-1], tri[i-1][j]);
			}
		}
		int max = 0;
		for (int i = 0; i < tri.length; i++) {
			if(max < tri[N][i]) max = tri[N][i];
		}
		System.out.println(max);
	}
}
