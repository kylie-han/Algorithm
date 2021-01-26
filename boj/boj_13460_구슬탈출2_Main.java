import java.util.Arrays;
import java.util.Scanner;
// 5:00시작
// 사방탐색, BFS
// R기준으로 사방탐색하면서 .의 위치를 큐에 저장하고 R이 0에 닿을때까지 진행한다.
// 만약R이 들어가고 B가 들어가지 않으면 종료, R이 들어가고 B가 들어가면 끝까지 진행, ans = -1
public class boj_13460_구슬탈출2_Main {
	static char[][] map;
	static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		map = new char[N][M];
		RC red = new RC(0,0);
		RC blue = new RC(0,0);
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 'R') {
					red = new RC(i,j);
				}
				else if(map[i][j] == 'B') {
					blue = new RC(i,j);
				}
			}
		}
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		System.out.println(red.toString());
		System.out.println(blue.toString());
		// 입력확인
		bfs();
	}
	private static void bfs() {
		// 현재위치가 O이면 B가 들어갔는지 확인, 
		for (int i = 0; i < dir.length; i++) {
			// 현재 위치의 상하좌우를 확인해서 .이면 bfs에 들어갈것
		}
	}
	
}
class RC{
	int r;
	int c;
	
	public RC(int r, int c) {
		this.r = r;
		this.c = c;
	}

	@Override
	public String toString() {
		return "RC [r=" + r + ", c=" + c + "]";
	}
	
}