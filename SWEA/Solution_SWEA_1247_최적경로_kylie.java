import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1247_최적경로_kylie {
	static int n;
	static int[][] map;
	static boolean[] visited;
	static StringTokenizer st;
	static int min;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			min = Integer.MAX_VALUE;
			n = Integer.parseInt(br.readLine());
			map = new int[n + 2][2]; // [0]:회사,[1]:집,[2~n-1]:고객집
			visited = new boolean[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
//				System.out.println(Arrays.toString(map[i]));
			} // end of input
				// 회사부터 고객 집을 거쳐 집까지 가는 거리를 dfs로 탐색하고
			dfs(map[0][0], map[0][1], 0, 0);
			// 그중 가장 작은 경로의 이동거리를 출력한다.
			System.out.println("#"+t+" "+min);
		} // end of for tc
	}// end of main

	/**
	 * 
	 * @param x     : 현재 방문한 고객집의 x좌표
	 * @param y     : 현재 방문한 고객집의 y좌표
	 * @param depth : dfs의 깊이 (0~n-1),n-1이 마지막노드이므로 n이면 종료
	 * @param sum   : 현재까지 지나온 거리 ->출력할 값
	 */
	public static void dfs(int x, int y, int depth, int sum) {
		if (depth == n) {
			sum += Math.abs(x - map[1][0]) + Math.abs(y - map[1][1]);
			if (min > sum)
				min = sum;
			return;
		} else {
			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					visited[i] = true;
					sum += Math.abs(x - map[i + 2][0]) + Math.abs(y - map[i + 2][1]);
					dfs(map[i + 2][0], map[i + 2][1], depth + 1, sum);
					visited[i] = false;
					sum -= Math.abs(x - map[i + 2][0]) + Math.abs(y - map[i + 2][1]);
				}
			}
		}
	}
}// end of class
