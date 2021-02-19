import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_2468_Main {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int flood;
	static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int area = 0;
	static Queue<AreaDot> q = new LinkedList<AreaDot>();
	static int max = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				if (flood < map[i][j])
					flood = map[i][j];
			}
//			System.out.println(Arrays.toString(map[i]));
		}
//		System.out.println(flood);

//		3. flood-1��ŭ ��ö����� �ݺ�
		for (int k = 0; k < flood; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
//		1. map���� 1��ŭ ����� ����� �ʴ°� Ȯ��
					if (!visited[i][j] && map[i][j] > k) {
//		2. ���������� bfsŽ��
						bfs(new AreaDot(i, j), k);
						area++;
					}
				}
			}
//			���� ���� �ø� ��� ��� �ʱ�ȭ
			visited = new boolean[N][N];
			max = Integer.max(area, max);
			area = 0;
		}

		System.out.println(max);
		sc.close();
	}

	static void bfs(AreaDot d, int k) {
		visited[d.x][d.y] = true;
		q.add(d);

		while (!q.isEmpty()) {
			AreaDot t = q.poll();
			int x = t.x;
			int y = t.y;

			for (int i = 0; i < 4; i++) {
				int dx = x + dirs[i][0];
				int dy = y + dirs[i][1];

				if (dx >= 0 && dx < N && dy >= 0 && dy < N && map[dx][dy] > k && !visited[dx][dy]) {
					visited[dx][dy] = true;
					q.add(new AreaDot(dx, dy));
				}
			}
		}
	}
}

class AreaDot {
	int x;
	int y;

	public AreaDot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
