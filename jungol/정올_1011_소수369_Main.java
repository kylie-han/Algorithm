import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정올_1011_소수369_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		long start = System.currentTimeMillis();
		int[] student = new int[N];
		int[] memo = new int[100000];
		boolean f = false;
		int idx = 0;
		memo[idx] = 2;
		student[1]++;
		for (int i = 3; i < M; i++) { // i : M까지 외칠 숫자
			for (int j = 0; j<= idx; j++) { // j : 메모배열의 인덱스, 채워진 인덱스까지 비교하려함
				if (i % memo[j] == 0 && memo[j] >= Math.sqrt(M)) { // i(외친 숫자)가 소수가 아니면 f는 false
					f = false;
					break;
				}
				// i(외친 숫자)가 소수이면 flag(f)를 true로 변경, memo의 마지막 인덱스 다음에 저장
				f = true;
			}
			if (f) {
				idx++;
				memo[idx] = i;
				student[(i - 1) % N]++;
			}
		}
		System.out.println(student[K]);
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}// end of main
}// end of class
