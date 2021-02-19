import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1992_Main {
	static int N;
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			String arri = br.readLine();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = arri.charAt(j)-48;
			}
		}
		quad(N,0,0);
		System.out.println(sb.toString());
	}
	private static void quad(int n, int i, int j) {
		if(n <= 1) {
			sb.append(""+arr[i][j]);
		}else {
			int start = arr[i][j];
			boolean flag = false;
			for (int x = i; x < i+n; x++) {
				if(flag)break;
				for (int y = j; y < j+n; y++) {
					if (start != arr[x][y]) {
						flag = true;
						break;
					}
				}
			}
			if(flag) {
				sb.append("(");
				for (int k = 0; k < 4; k++) {
					if(k%2 == 1) j+=n/2;
					if(k>1) i+=n/2;
					quad(n/2,i,j);
					if(k%2 == 1) j-=n/2;
					if(k>1) i-=n/2;
				}
				sb.append(")");
			}else {
				sb.append(start);
			}
		}
	}
}
