import java.util.Arrays;
import java.util.Scanner;
// ������ �߸� ������.
// ������ ������ ��ٸ��� Ÿ�µ� �̵��� Ƚ���� ���� ª�� �������� ã�� ��.
// ���������� 1���� ��� �ľ��Ͽ� ����->����� Ƚ���� ���� ���� ª�� ���� ã���� ��.
public class Solution_SWEA_1211_Ladder2_kylie {
	static int[][] map = new int[100][100];
	static boolean[][] visited;
	static int bombX = 99, bombY = 99;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int ans = 0;
			// �׽�Ʈ���̽� ��ȣ
			sc.nextInt();
			// ����ü
			int startcnt = 0;
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					map[j][k] = sc.nextInt();
					if(j == 0 && map[j][k] == 1) {
						// �������� ����
						startcnt++;
					}
				}
			}
//			System.out.println(startcnt);
			int[] start = new int[startcnt];
			int[] end = new int[startcnt];
			int idx = 0;
			for(int j = 0; j < map.length; j++) {
				if(map[0][j] == 1) {
					start[idx++] = j;
				}
			}
//			System.out.println(Arrays.toString(start));
			int min = Integer.MAX_VALUE;
			int cnt = 0;
			// ��� �������� ������ �����ϰ� Ƚ���� ī��Ʈ�Ͽ� end�迭�� �����Ѵ�.
			for (int j = 0; j < startcnt; j++) {
				visited = new boolean[100][100];
				int r = 0, c = 0;
				c = start[j];
				cnt = 0;
				visited[r][c] = true;
				while(r < 99) {
//					System.out.println(r +" / "+ c);
					// ���ʿ� �� �� �ִ� ��ٸ��� ������ �������� ���� ���������� ����
					if(c>0 && map[r][c-1] == 1 && !visited[r][c-1]) {
						c--;
						cnt++;
						visited[r][c] = true;
						while(map[r+1][c] != 1) {
							c--;
							cnt++;
							visited[r][c] = true;
						}
					}
					// �����ʿ� �� �� �ִ� ��ٸ��� ������ �������� ���� ���������� ����
					else if(c<99 && map[r][c+1] == 1 && !visited[r][c+1]) {
						c++;
						cnt++;
						visited[r][c] = true;
						while(map[r+1][c] != 1) {
							c++;
							cnt++;
							visited[r][c] = true;
						}
					}
					r++;
					cnt++;
					visited[r][c] = true;
				}
				// �������� ���� ans
				if(min >= cnt) {
					min = cnt;
					ans = start[j];
				}
			}
			System.out.println("#"+(i+1)+" "+ans);
		}
	}
}
