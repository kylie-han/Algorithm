import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 5:00시작
// 사방탐색, BFS
// R기준으로 사방탐색하면서 .의 위치를 큐에 저장하고 R이 0에 닿을때까지 진행한다.
// 만약R이 들어가고 B가 들어가지 않으면 종료, R이 들어가고 B가 들어가면 끝까지 진행, ans = -1
public class boj_13460_구슬탈출2_Main {
	static int N,M;
	static char[][] map;
	static boolean[][][][] visited;
	static int[] dirR = {-1,1,0,0};
	static int[] dirC = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Node node = new Node();
		node.cnt = 0;
		map = new char[N][M];
		visited = new boolean[10][10][10][10];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 'R') {
					node.rRow = i;
					node.rCol = j;
				}
				else if(map[i][j] == 'B') {
					node.bRow = i;
					node.bCol = j;
				}
			}
		}
//		for (int i = 0; i < map.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
		// 입력확인
		bfs(node);
	}//main
	private static void bfs(Node ball) {
		Queue<Node> q = new LinkedList<>();
		q.offer(ball);
		
		while(!q.isEmpty()) {
			
			Node node = q.poll();
			visited[node.rRow][node.rCol][node.bRow][node.bCol] = true;
			//11번 이상일경우 -1 출력하고 빠져나가기
			if(node.cnt >= 10) {
				System.out.println(-1);
				return;
			}
			//현재의 두 구슬의 위치를 기준으로 동,서,남,북으로 굴려본다.
			for (int i = 0; i < dirC.length; i++) {
				// 파란 구슬을 먼저 굴린다.
				int bnRow = node.bRow;
				int bnCol = node.bCol;
				while(map[bnRow+dirR[i]][bnCol+dirC[i]]!= '#') {
					bnRow += dirR[i];
					bnCol += dirC[i];
					if(map[bnRow][bnCol] == 'O') {
						break;
					}
				}
				// 다음 빨간 구슬을 굴린다.
				int rnRow = node.rRow;
				int rnCol = node.rCol;
				while(map[rnRow+dirR[i]][rnCol+dirC[i]] != '#') {
					rnRow += dirR[i];
					rnCol += dirC[i];
					if(map[rnRow][rnCol] == 'O') {
						break;
					}
				}
				//blue가 O면 중단
				if(map[bnRow][bnCol] == 'O') {
					continue;
				}
				//red가 O면 출력
				if(map[rnRow][rnCol] == 'O') {
					System.out.println(node.cnt+1);
					return;
				}
				// 두 공의 위치가 다르다면 굴러온 방향에 따라 조정한다.
				if(bnRow == rnRow && bnCol == rnCol) {
					switch(i) {
					case 0://상
						if(node.rRow > node.bRow) rnRow++;
						else bnRow++;
						break;
					case 1://하
						if(node.rRow > node.bRow) bnRow--;
						else rnRow--;
						break;
					case 2://좌
						if(node.rCol > node.bCol) rnCol++;
						else bnCol++;
						break;
					case 3://우
						if(node.rCol > node.bCol) bnCol--;
						else rnCol--;
						break;
					}
				}
				if(!visited[rnRow][rnCol][bnRow][bnCol]) {
					q.offer(new Node(rnRow,rnCol,bnRow,bnCol,node.cnt+1));
				}
			}
		}//while
		System.out.println(-1);
	}//bfs
}//class
class Node{
	int rRow;
	int rCol;
	int bRow;
	int bCol;
	int cnt;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int rRow, int rCol, int bRow, int bCol, int cnt) {
		super();
		this.rRow = rRow;
		this.rCol = rCol;
		this.bRow = bRow;
		this.bCol = bCol;
		this.cnt = cnt;
	}
	
}