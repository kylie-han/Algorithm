import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1912_Main {
	static int N,max;
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		arr[0][1] = arr[0][0];
		max = arr[0][1];
		for (int i = 1; i < arr.length; i++) {
				arr[i][1] = arr[i][0] > arr[i][0] + arr[i-1][1] ? arr[i][0] : arr[i][0] + arr[i-1][1];
				max = Math.max(max, arr[i][1]);
		}
		System.out.println(max);
	}
}
