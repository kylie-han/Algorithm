import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1463_Main {
	static int N;
	static int[] arr;
	static int max = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		for (int i = 2; i <= N; i++) {
			int three = i%3 == 0? i/3: i-1;
			int two = i%2 == 0? i/2:i-1;
			int one = i-1;
			arr[i] = Math.min(arr[three], Math.min(arr[two], arr[one]))+1		;
		}
		System.out.println(arr[N]);
	}
}
