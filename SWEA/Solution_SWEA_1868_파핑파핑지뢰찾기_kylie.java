import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SWEA_1868_������������ã��_kylie {
	static int N;
	static char[][] map;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new char[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				map[i] = br.readLine().toCharArray();
//				System.out.println(Arrays.toString(map[i]));
			}
			//end of input
			int cnt = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == '.') {
						if (checkBomb(i,j) == 0) {
							map[i][j] = 'c';
							bfs(i, j);
						}
					}else if (map[i][j] == '0') {
						bfs(i,j);
					}
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == '.' || map[i][j] == 'c') {
						cnt++;
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}//end of T
	}//end of main
	// �ȹ�Ž���� ���� nav�迭
	static int[][] nav = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static boolean[][] visited;
	
	// ���ϴ� ��ġ������ �ֺ�Ž���� ���� bfs�޼ҵ�
	private static void bfs(int i, int j) {
		visited[i][j] = true;
		for (int k = 0; k < nav.length; k++) {
			int dI = i+nav[k][0];
			int dJ = j+nav[k][1];
			if(!isIn(dI,dJ)) continue;
			if(map[dI][dJ] == 'c') continue;
			map[dI][dJ] = (char)(checkBomb(dI, dJ)+'0');
			if (map[dI][dJ] == '0' && !visited[dI][dJ]) bfs(dI, dJ);
		}
	}
	
	// �迭�� i,j���� �ֺ� ���ڰ����� �����ϴ� �޼ҵ�
	private static int checkBomb(int i, int j) {
		int c = 0;
		for (int k = 0; k < nav.length; k++) {
			if (!isIn(i+nav[k][0], j+nav[k][1])) continue;
			if (map[i + nav[k][0]][j + nav[k][1]] == '*') c++;
		}
		return c;
	}
	
	// ����� ���� �迭�� �������� �������� Ȯ���ϴ� �޼ҵ�
	private static boolean isIn(int r, int c) {
		if (r < 0 || c < 0 || r >= N || c >= N) return false;
		return true;
	}
}//end of class

