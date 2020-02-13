import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n°úm4_Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] per = new int[8];
		boolean[] used = new boolean[8];

		bfs(per, used, n, m, 0);
		br.close();
		bw.flush();
		bw.close();

	}// end of main

	public static void bfs(int[] per, boolean[] used, int n, int m, int i) throws IOException {
		if (i == m) {
			for (int j = 0; j < m; j++) {
				bw.write(per[j] + " ");
			}
			bw.newLine();
		} else {
			for (int j = 1; j <= n; j++) {
				if (used[i] || (i != 0 && j < per[i - 1]))
					continue;
				per[i] = j;
				bfs(per, used, n, m, i + 1);
			}
		}
	}
}// end of class
