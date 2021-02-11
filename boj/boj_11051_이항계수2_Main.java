import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class boj_11051_이항계수2_Main {
	static int N,K,ans;
	static boolean[] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		ans = 0;
		Stack<Integer> st = new Stack<>();
		
		visit = new boolean[N];
		comb(K, 0);
		System.out.println(ans);
	}

	private static void comb(int c, int d) {
		if(c == 0) {
			System.out.println(Arrays.toString(visit));
			ans++;
			return;
		}
		for (int i = d; i < N; i++) {
			if(visit[i]) continue;
			visit[i] = true;
			System.out.print(i + " ");
			comb(c-1,i+1);
			visit[i] = false;
		}
		
	}
	
}
