import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * 
�׷���Ž�� : �׷����� ��� ��带 �湮�ϴ� ��
 * 
bfs�� dfs�� �����
bfs(�ʺ�켱Ž��)
	bfs�� ��Ʈ���� ������ ���̺��� ���ι����� �켱���� Ž���Ѵ�.
	�ʺ� �켱���� Ž���ϱ� ������  ���̵Ǵ� ��ΰ� �������� ��� �ִܰ�θ� ã�´�.
	������ ���� ���̰� ���� �ذ� ������ �� �����ϴ�.
	ex) �̷�ã��, �ִܰŸ����ϱ�
	������� : ť�� ��Ʈ��带 �ִ´�. ���� �۾��� while������ ť�� ���̰� 0���� ũ�� ������ �����Ѵ�. �ݺ����� ������ ť�� �ִ� ������ �ϳ��� ���� �� ����� �ڽ��� �����ϸ� ��� ť�� �ְ� �ڽ��� ���ٸ� �ִܰ�η� �ν�
dfs(���̿켱Ž��)
	dfs�� ��Ʈ���� ������ �ϳ��� ��带 Ž���ϸ� �� �ڽĵ��� ��� Ž���Ѵ�.
	���̸� �켱���� Ž���ϱ� ������ �ִ� 
	
	��θ� Ž���ϱ����ؼ� ��ü�� Ž���ؾ��Ѵ�.
	���� �ƴ� ��ΰ� ��ٸ� �� ��ο� ���� ���� ����� �ִ�.
	�ܼ��˻��� �־�� bfs���� �������� ��Ʈ��ŷ, �̷λ����˰��� ���� ���δ�.
	��� ����� �� ã�⿡ ����

13 12
0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 1 0 0 0
0 1 1 1 0 0 0 1 1 0 0 0
0 1 1 1 1 1 1 0 0 0 0 0
0 1 1 1 1 1 0 1 1 0 0 0
0 1 1 1 1 0 0 1 1 0 0 0
0 0 1 1 0 0 0 1 1 0 0 0
0 0 1 1 1 1 1 1 1 0 0 0
0 0 1 1 1 1 1 1 1 0 0 0
0 0 1 1 1 1 1 1 1 0 0 0
0 0 1 1 1 1 1 1 1 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0

 * 
����Ž��(bfs)�� Ǯ�� : 23524KB	216ms
visited ��� : 20820KB	192ms

 */
public class boj_2636_ġ��_bfsdfs {
	static int N,M;
	static int[][] map;
	static boolean[][] visited;
	static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	static int cnt,lastCnt,time = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) cnt++;
			}
		}
		// 0: ����, 1: ġ��, 2: ����, 3: ���� ġ��
		// 1. 0,0�� ���� �׷��� 0���� Ȯ���Ѵ�. -> ������(map[i][j] = -1)
		// 2. ����(-1)�� �´���ִ� 1���� Ȯ���Ѵ�. -> �ѽð� �ڿ� ���� ���̵�(air = true)
		// 3. �ѻ���Ŭ�� ������ ���� ġ����� ��´�.
		Arrays.fill(map[0], 2);
		while (cnt != 0) {
			lastCnt = cnt;
			time++;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (visited[i][j]) continue;
					if (map[i][j] == 2) {
						Air(i,j);
					}
				}
			}
			melting();
		}
		System.out.println(time);
		System.out.println(lastCnt);
		
	}
	private static void melting() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 3) {
					map[i][j] = 2;
					cnt--;
				}
			}
		}
	}
	private static void Air(int i, int j) {
		Queue<Cheese> q = new LinkedList<Cheese>();
		Cheese cheese = new Cheese(i, j);
		q.add(cheese);
		while(!q.isEmpty()) {
			Cheese c = q.poll();
			visited[c.i][c.j]= true; 
			// ���Ž���ؼ� 0�̸� 2�� ����, 1�̸� 3�� ����
			for (int k = 0; k < dirs.length; k++) {
				int dx = c.i+dirs[k][0];
				int dy = c.j+dirs[k][1];
				if (!isIn(dx, dy)) continue;
				if (visited[dx][dy]) continue;
				if (map[dx][dy] == 0) {
					map[dx][dy] = 2;
					Air(dx,dy);
				}
				else if (map[dx][dy] == 1) {
					map[dx][dy] = 3;
				}
			}
		}
	}
	private static boolean isIn(int dx, int dy) {
		if (dx>=0 && dx<N && dy>=0 && dy<M) {
			return true;
		}
		return false;
	}
}
class Cheese{
	int i;
	int j;
	
	public Cheese(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
}
