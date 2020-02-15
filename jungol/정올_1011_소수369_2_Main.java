import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정올_1011_소수369_2_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

//		long start = System.currentTimeMillis();
		int[] student = new int[N];
		int[] arr = new int[M + 1];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = i;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0)
				continue;
			for (int j = 2 * i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) {
				student[(i - 1) % N]++;
			}
		}
		System.out.println(student[K]);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
	}// end of main
}// end of class
