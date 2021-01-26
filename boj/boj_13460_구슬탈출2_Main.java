import java.util.Arrays;
import java.util.Scanner;
// 5:00����
// ���Ž��, BFS
// R�������� ���Ž���ϸ鼭 .�� ��ġ�� ť�� �����ϰ� R�� 0�� ���������� �����Ѵ�.
// ����R�� ���� B�� ���� ������ ����, R�� ���� B�� ���� ������ ����, ans = -1
public class boj_13460_����Ż��2_Main {
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
		// �Է�Ȯ��
		bfs();
	}
	private static void bfs() {
		// ������ġ�� O�̸� B�� ������ Ȯ��, 
		for (int i = 0; i < dir.length; i++) {
			// ���� ��ġ�� �����¿츦 Ȯ���ؼ� .�̸� bfs�� ����
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