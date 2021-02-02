import java.util.Scanner;

public class boj_2798_∫Ì∑¢¿Ë_Main {
	static int N,M;
	static int[] arr;
	static boolean[] visited;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		ans = 0;
		blackjack(0,0);
		System.out.println(ans);
		sc.close();
	}
	private static void blackjack(int sum, int cnt) {
		if(cnt >= 3) {
			ans = sum>ans && sum <= M? sum : ans;
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if(visited[i])continue;
			sum += arr[i];
			visited[i] = true;
			blackjack(sum, cnt+1);
			sum -= arr[i];
			visited[i] = false;
		}
		
	}
}
