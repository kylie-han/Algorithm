import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_11720_숫자의합_bronze2_Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String M = br.readLine();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += M.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
