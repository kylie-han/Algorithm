import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class º°ÀÚ¸® {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int tc = Integer.parseInt(st.nextToken());
		for (int t = 1; t <= tc; t++) {
			int[][] d = new int[10][10];
			boolean[][] v = new boolean[10][10];
			for (int i = 0; i < 10; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 10; j++) {
					d[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int[] c = { -1, 0, 1, -1, 1, -1, 0, 1 };
			int[] r = { -1, -1, -1, 0, 0, 1, 1, 1 };

			Queue<Map> q = new LinkedList<>();

			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[i][j] == 1) {
						v[i][j] = true;
						q.offer(new Map(i, j));
						while (!q.isEmpty()) {
							Map map = q.poll();
							for (int k = 0; k < c.length; k++) {
								int di = map.i + r[k];
								int dj = map.j + c[k];
								if (di < 0 || di > 9 || dj < 0 || dj > 9 || v[di][dj])
									continue;
								if (d[di][dj] == 1) {
									d[di][dj] = 0;
									q.offer(new Map(di, dj));
								}
							}
						}
					}
				}
			}
			int cnt = 0;
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[i][j] == 1) cnt++;
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
}

class Map {
	int i;
	int j;

	public Map(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
}
