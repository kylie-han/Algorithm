import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n°úm5_Main {
	static int n, m;
	static int[] arr;
	static int[] out;
	static boolean[] used;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		out = new int[m];
		used = new boolean[n];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		Arrays.sort(arr);
		dfs(0);
		br.close();
		bw.flush();
		bw.close();
	}// end of main

	public static void dfs(int i) throws IOException {
		if (i == m) {
			for (int j = 0; j < m; j++) {
				bw.write(out[j] + " ");
			}
			bw.newLine();
		} else {
			for (int j = 0; j < n; j++) {
				if (used[j])
					continue;
				used[j] = true;
				out[i] = arr[j];
				dfs(i + 1);
				used[j] = false;
				
			}
		}
	}
}// end of class
