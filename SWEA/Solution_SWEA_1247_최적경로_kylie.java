import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1247_�������_kylie {
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
			map = new int[n + 2][2]; // [0]:ȸ��,[1]:��,[2~n-1]:����
			visited = new boolean[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
//				System.out.println(Arrays.toString(map[i]));
			} // end of input
				// ȸ����� �� ���� ���� ������ ���� �Ÿ��� dfs�� Ž���ϰ�
			dfs(map[0][0], map[0][1], 0, 0);
			// ���� ���� ���� ����� �̵��Ÿ��� ����Ѵ�.
			System.out.println("#"+t+" "+min);
		} // end of for tc
	}// end of main

	/**
	 * 
	 * @param x     : ���� �湮�� ������ x��ǥ
	 * @param y     : ���� �湮�� ������ y��ǥ
	 * @param depth : dfs�� ���� (0~n-1),n-1�� ����������̹Ƿ� n�̸� ����
	 * @param sum   : ������� ������ �Ÿ� ->����� ��
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
