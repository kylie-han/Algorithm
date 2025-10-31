import java.util.Scanner;

public class boj_15649_N°úM1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		used = new boolean[N+1];
		per = new int[M];
		permutation(N,M,0);
		sc.close();
	} // end of main
	static boolean[] used;
	static int[] per;
	private static void permutation(int n, int m, int d) {
		if (d == m) {
			for (int i = 0; i < per.length; i++) {
				System.out.print(per[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!used[i]) {
				per[d] = i;
				used[i] = true;
				permutation(n,m,d+1);
				used[i] = false;
			}
		}
	}
} // end of class
