import java.util.Scanner;

public class Boj_11050_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[][] arr = new long[N][N+1];
		arr[0][0] = 1;
		arr[0][1] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
			arr[i][i+1] = 1;
		}
		System.out.println(arr[N-1][K]);
	}
}
