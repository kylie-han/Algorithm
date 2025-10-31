import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * 
그래프탐색 : 그래프의 모든 노드를 방문하는 것
 * 
bfs와 dfs의 장단점
bfs(너비우선탐색)
	bfs는 루트부터 시작해 깊이별로 가로방향을 우선으로 탐색한다.
	너비를 우선으로 탐색하기 때문에  답이되는 경로가 여러개일 경우 최단경로를 찾는다.
	노드수가 적고 깊이가 얕은 해가 존재할 때 유리하다.
	ex) 미로찾기, 최단거리구하기
	구현방법 : 큐에 루트노드를 넣는다. 이후 작업은 while문으로 큐의 길이가 0보다 크면 무한히 수행한다. 반복문을 실행해 큐에 있는 노드들을 하나씩 꺼내 그 노드의 자식이 존재하면 모두 큐에 넣고 자식이 없다면 최단경로로 인식
dfs(깊이우선탐색)
	dfs는 루트부터 시작해 하나의 노드를 탐색하면 그 자식들을 모두 탐색한다.
	깊이를 우선으로 탐색하기 때문에 최단 
	
	경로를 탐색하기위해선 전체를 탐색해야한다.
	답이 아닌 경로가 깊다면 그 경로에 깊이 빠질 우려가 있다.
	단순검색에 있어서는 bfs보다 느리지만 백트래킹, 미로생성알고리즘에 많이 쓰인다.
	모든 경우의 수 찾기에 적합

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
완전탐색(bfs)로 풀이 : 23524KB	216ms
visited 사용 : 20820KB	192ms

 */
public class boj_2636_치즈_bfsdfs {
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
		// 0: 구멍, 1: 치즈, 2: 공기, 3: 녹을 치즈
		// 1. 0,0과 같은 그룹인 0들을 확인한다. -> 공기중(map[i][j] = -1)
		// 2. 공기(-1)와 맞닿아있는 1들을 확인한다. -> 한시간 뒤에 녹을 아이들(air = true)
		// 3. 한사이클이 끝나면 녹을 치즈들이 녹는다.
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
			// 사방탐색해서 0이면 2로 변경, 1이면 3로 변경
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
