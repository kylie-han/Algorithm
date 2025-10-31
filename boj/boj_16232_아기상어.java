import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_16232_아기상어 {
	static int N;//공간의 크기N(2~20)
	static int[][] map;
	// 상어의 이동거리
	static int sharkMoveCnt;
	static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		StringTokenizer st = null;
		Shark shark = null;
		
		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < N; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				if(map[r][c] == 9) {
					shark = new Shark(r, c, 2, 0, 0);
					map[r][c] = 0;
				}
			}
//			System.out.println(Arrays.toString(map[r]));
		}//입력
		
		bfs(shark);
		
		System.out.println(sharkMoveCnt);
		
	}//end of main
	static void bfs(Shark shark) {
		Queue<Shark> queue = new LinkedList<>();
		queue.offer(shark);
		boolean[][] visited = new boolean[N][N];
		visited[shark.row][shark.col] = true;
		
		// 먹을 수 있는 물고기를 저장할 PQ
		PriorityQueue<Fish> targetFishes = new PriorityQueue<>();
		Shark front = null;
findFish:	while (!queue.isEmpty()) {
			front = queue.poll();
			
			for (int d = 0; d < dirs.length; d++) {
				int nr = front.row + dirs[d][0];
				int nc = front.col + dirs[d][1];
				if(isIn(nr, nc) && !visited[nr][nc]) {
					visited[nr][nc] = true;
					// 이동한 점의 값에 따라서 분기 처리
					// 이동가능
					if(map[nr][nc] == 0 || map[nr][nc] == front.size) {
						queue.offer(new Shark(nr, nc, front.size, front.depth+1,front.eatCnt));
					}
					//먹을 수 있다
					else if(map[nr][nc]<front.size) {
						if(targetFishes.isEmpty()) {
							targetFishes.offer(new Fish(nr, nc, map[nr][nc], front.depth+1));
						}
						// 비어있지 않다면
						else {
							Fish first = targetFishes.peek();
							if(first.dist<front.depth+1) {
								break findFish;
							}else {
								targetFishes.offer(new Fish(nr, nc, map[nr][nc], front.depth+1));
							}
						}
					}
				}
			}
		}
		//먹을게 없다.
		if(targetFishes.isEmpty()) {
			return;
		}
		//맨 처음 녀석을 먹자.
		else {
			Fish food = targetFishes.poll();
			front.eat();
			map[food.row][food.col]=0;
			
			sharkMoveCnt += food.dist;
			
			bfs(new Shark(food.row, front.col, front.size, 0, front.eatCnt));
		}
	}
	static boolean isIn(int row, int col) {
		return 0 <= row && row < N && 0 <= col && col < N;
	}
	static class Fish implements Comparable<Fish>{
		int row,col;
		int size;
		int dist;
		public Fish(int row, int col, int size, int dist) {
			super();
			this.row = row;
			this.col = col;
			this.size = size;
			this.dist = dist;
		}
		@Override
		public int compareTo(Fish o) {
			if(this.dist == o.dist) {
				if(this.row == o.row) {
					return Integer.compare(this.col, o.col);
				}else {
					return Integer.compare(this.row, o.row);
				}
			}else {
				return Integer.compare(this.dist, o.dist);
			}
		}
		
	}
	static class Shark{
		int row, col;
		int size;
		int depth;// bfs의 탐색 너비
		int eatCnt;
		public Shark(int row, int col, int size, int depth, int eatcnt) {
			super();
			this.row = row;
			this.col = col;
			this.size = size;
			this.depth = depth;
			this.eatCnt = eatcnt;
		}
		
		public void eat() {
			eatCnt++;
			if(eatCnt == size) {
				size++;
				eatCnt = 0;
			}
		}
	}
}//end of class
