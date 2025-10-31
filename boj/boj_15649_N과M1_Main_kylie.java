import java.util.Scanner;

public class boj_15649_N°úM1_Main_kylie {
	static int N,R;
	static int[] ans;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		ans = new int[R];
		visited = new boolean[N];
		perm(0);
	}
	private static void perm(int r) {
		if(r >= R) {
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if(!visited[i]) {
			ans[r] = i+1;
			visited[i] = true;
			perm(r+1);
			visited[i] = false;
			}
		}
	}
}
