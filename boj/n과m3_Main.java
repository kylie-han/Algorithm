import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n°úm3_Main {
	static int[] per = new int[7];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		dfs(n, m, 0);
		br.close();
		bw.flush();
		bw.close();
	}// end of main

	public static void dfs(int n, int m, int i) throws IOException {
		if (i == m) {
			for (int j = 0; j < m; j++) {
				bw.write(String.valueOf(per[j]) + " ");
			}
			bw.newLine();
			return;
		} else {
			for (int j = 1; j <= n; j++) {
				per[i] = j;
				dfs(n, m, i + 1);
			}
		}
	}
}// end of class
