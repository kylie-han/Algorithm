import java.util.Scanner;

public class boj_1256_사전_gold3_Main_미완성 {
	static int N;
	static int M;
	static int K;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		sc.close();
		// 중복순열
		char[] arr = new char[N + M];
		for (int i = 0; i < arr.length; i++) {
			if (i < N)
				arr[i] = 'a';
			else
				arr[i] = 'z';
		}
		char[] result = new char[N + M];
		permutation(result, N, M, 0);
	}

	private static void permutation(char[] array, int n, int m, int depth) {
		if (depth == array.length) {
			K--;
			if (K == 0) {
				for (int i = 0; i < array.length; i++) {
					sb.append(array[i]);
				}
				System.out.println(sb.toString());
			}
			return;
		}
		if (n > 0) {
			array[depth] = 'a';
			permutation(array, n - 1, m, depth + 1);// array = {'a', ' ', ' ', ' '}
		}
		if (m > 0) {
			array[depth] = 'z';
			permutation(array, n, m - 1, depth + 1);// array = {'z', ' ', ' ', ' '}
		}
	}
}
