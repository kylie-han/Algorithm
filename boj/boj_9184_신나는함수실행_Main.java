import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9184_신나는함수실행_Main {
	static int a,b,c;
	static int[][][] dp = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine().trim());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1 && c == -1) break;
			sb.append("w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	private static int w(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		else if(a>20 || b>20 || c>20) {
			return w(20,20,20);
		}
		else if(dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		else if(a<b && b<c) {
			dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			return dp[a][b][c];
		}
		else{
			dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			return dp[a][b][c];
		}
	}
}
