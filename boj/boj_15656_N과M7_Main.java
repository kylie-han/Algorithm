import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_15656_N°úM7_Main {
	static int[] arr;
	static int n,m;
	static int[] output;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		output = new int[m];
		Arrays.sort(arr);
		dfs(0);
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	public static void dfs(int i) throws IOException {
		if(i == m) {
			for (int j = 0; j < m; j++) {
				bw.write(output[j] + " ");
			}
			bw.newLine();
			return; 
		}else {
			for (int j = 1; j <= n; j++) {
				output[i] = arr[j-1];
				dfs(i+1);
			}
		}
	}
}
