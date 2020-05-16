import java.util.Scanner;

public class SWEA_5643_Ű����_ws {
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
			//���� - ��� �������� ������ ū ����� ����, ������ ���� ��� ���� �� ���� N-1�̸� �� �� �ִ�. -> result+1
			for(int i = 1; i <= N; i++) {
				cnt = 0;
				v = new boolean[N+1];
//				������ ū ��� ����
				dfs(i);
				v = new boolean[N+1];
//				������ ���� ��� ����
				dfs1(i);
				if (cnt == N-1) {
					result++;
				}
			}
			
			
			//���
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
