import java.util.Scanner;

public class SWEA_5643_키순서_ws {
	static int result = 0;
	static int N,M;
	static int[][] map;
	static int cnt;
	static boolean[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc <=T;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N+1][N+1];
			for (int i = 0; i < M; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = 1;
			}
			result = 0;
			//구현 - 모든 정점에서 나보다 큰 사람수 세고, 나보다 작은 사람 세고 그 합이 N-1이면 알 수 있다. -> result+1
			for(int i = 1; i <= N; i++) {
				cnt = 0;
				v = new boolean[N+1];
//				나보다 큰 사람 세기
				dfs(i);
				v = new boolean[N+1];
//				나보다 작은 사람 세기
				dfs1(i);
				if (cnt == N-1) {
					result++;
				}
			}
			
			
			//출력
			System.out.println("#"+tc+" "+result);
		}
	}
	static void dfs(int idx) {
		v[idx] = true;
		for (int i = 1; i<= N; i++) {
			if(v[i]) continue;
			if(map[idx][i] == 0) continue;
			cnt++;
			dfs(i);
		}
	}
	static void dfs1(int idx) {
		v[idx] = true;
		for (int i = 1; i<= N; i++) {
			if(v[i]) continue;
			if(map[i][idx] == 0) continue;
			cnt++;
			dfs1(i);
		}
	}
}
