import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 5:00����
// ���Ž��, BFS
// R�������� ���Ž���ϸ鼭 .�� ��ġ�� ť�� �����ϰ� R�� 0�� ���������� �����Ѵ�.
// ����R�� ���� B�� ���� ������ ����, R�� ���� B�� ���� ������ ����, ans = -1
public class boj_13460_����Ż��2_Main {
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
		// �Է�Ȯ��
		bfs(node);
	}//main
	private static void bfs(Node ball) {
		Queue<Node> q = new LinkedList<>();
		q.offer(ball);
		
		while(!q.isEmpty()) {
			
			Node node = q.poll();
			visited[node.rRow][node.rCol][node.bRow][node.bCol] = true;
			//11�� �̻��ϰ�� -1 ����ϰ� ����������
			if(node.cnt >= 10) {
				System.out.println(-1);
				return;
			}
			//������ �� ������ ��ġ�� �������� ��,��,��,������ ��������.
			for (int i = 0; i < dirC.length; i++) {
				// �Ķ� ������ ���� ������.
				int bnRow = node.bRow;
				int bnCol = node.bCol;
				while(map[bnRow+dirR[i]][bnCol+dirC[i]]!= '#') {
					bnRow += dirR[i];
					bnCol += dirC[i];
					if(map[bnRow][bnCol] == 'O') {
						break;
					}
				}
				// ���� ���� ������ ������.
				int rnRow = node.rRow;
				int rnCol = node.rCol;
				while(map[rnRow+dirR[i]][rnCol+dirC[i]] != '#') {
					rnRow += dirR[i];
					rnCol += dirC[i];
					if(map[rnRow][rnCol] == 'O') {
						break;
					}
				}
				//blue�� O�� �ߴ�
				if(map[bnRow][bnCol] == 'O') {
					continue;
				}
				//red�� O�� ���
				if(map[rnRow][rnCol] == 'O') {
					System.out.println(node.cnt+1);
					return;
				}
				// �� ���� ��ġ�� �ٸ��ٸ� ������ ���⿡ ���� �����Ѵ�.
				if(bnRow == rnRow && bnCol == rnCol) {
					switch(i) {
					case 0://��
						if(node.rRow > node.bRow) rnRow++;
						else bnRow++;
						break;
					case 1://��
						if(node.rRow > node.bRow) bnRow--;
						else rnRow--;
						break;
					case 2://��
						if(node.rCol > node.bCol) rnCol++;
						else bnCol++;
						break;
					case 3://��
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