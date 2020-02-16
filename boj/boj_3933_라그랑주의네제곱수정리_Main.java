import java.util.Scanner;

public class boj_3933_라그랑주의네제곱수정리_Main {
	static int n;
	static int nr;
	static int[] arr;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			nr = (int) Math.sqrt(n) + 1;
			arr = new int[nr];
			cnt = 0;
			per(0);
			System.out.println(cnt);
		}

	}// end of main

	private static void per(int depth) {
		if (depth == arr.length || depth == 4) {
//			System.out.println(Arrays.toString(arr));
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i] * arr[i];
			}
			if (sum == n) {
				cnt++;
			}
		} else {
			for (int i = 0; i < arr.length || i < 4; i++) {
				if (depth != 0 && i < arr[depth - 1])
					continue;
				arr[depth] = i;
				per(depth + 1);
			}
		}

	}
}// end of class
