import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2146_Main {
	static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	static int islandIdx,N;
	static int map[][];
	static int MinDist;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//input
		// 1. 섬 구별해주기
		islandIdx = 2;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if (map[r][c] == 1) {
					bfs(r,c);
					islandIdx++;
				}
			}
		}
		for(int[] row : map) {
			System.out.println(Arrays.toString(row));
		}
		// 2. 각 섬에서 다른 섬까지의 최단 거리 찾아보기.
		MinDist = Integer.MAX_VALUE;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if (map[r][c] > 1) {
					getShortBridgeLength(r,c);
				}
			}
		}
	}
	static void getShortBridgeLength(int row, int col) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(row, col, map[row][col], 0));
		
		boolean[][] visited = new boolean[N][N];
		visited	[row][col] = true;
		while(!q.isEmpty()) {
			Point front = q.poll();
			//============= 코드 추가 ==================
		}
	}
	static void bfs(int row, int col) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(row, col, islandIdx));
		// 방문처리
		map[row][col] = islandIdx;
		while(!q.isEmpty()) {
			Point p = q.poll();
			for (int d = 0; d < dirs.length; d++) {
				int nr = p.row + dirs[d][0];
				int nc = p.col + dirs[d][1];
				if (isIn(nr, nc) && map[nr][nc] == 1) {
					map[nr][nc] = islandIdx;
					q.offer(new Point(nr, nc, islandIdx));
				}
			}
		}
		
	}
	static boolean isIn(int row, int col) {
		return 0<= row&& row<N && 0<=col && col<N;
	}
	static class Point{
		int row;
		int col;
		int islandIdx;
		int d;
		public Point(int row, int col, int islandIdx) {
			super();
			this.row = row;
			this.col = col;
			this.islandIdx = islandIdx;
		}
		public Point(int row, int col, int islandIdx, int d) {
			this(row,col,islandIdx);
			this.d = d;
		}
		@Override
		public String toString() {
			return "Point [row=" + row + ", col=" + col + ", islandIdx=" + islandIdx + "]";
		}
		
	}
	static String src = "10\r\n" + 
			"1 1 1 0 0 0 0 1 1 1\r\n" + 
			"1 1 1 1 0 0 0 0 1 1\r\n" + 
			"1 0 1 1 0 0 0 0 1 1\r\n" + 
			"0 0 1 1 1 0 0 0 0 1\r\n" + 
			"0 0 0 1 0 0 0 0 0 1\r\n" + 
			"0 0 0 0 0 0 0 0 0 1\r\n" + 
			"0 0 0 0 0 0 0 0 0 0\r\n" + 
			"0 0 0 0 1 1 0 0 0 0\r\n" + 
			"0 0 0 0 1 1 1 0 0 0\r\n" + 
			"0 0 0 0 0 0 0 0 0 0";
}
