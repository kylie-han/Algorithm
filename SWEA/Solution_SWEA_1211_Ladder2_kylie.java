import java.util.Arrays;
import java.util.Scanner;
// 문제를 잘못 이해함.
// 문제의 요점은 사다리를 타는데 이동한 횟수가 가장 짧은 시작점을 찾는 것.
// 도착지점의 1들을 모두 파악하여 도착->출발의 횟수를 세고 가장 짧은 것을 찾으면 됨.
public class Solution_SWEA_1211_Ladder2_kylie {
	static int[][] map = new int[100][100];
	static boolean[][] visited;
	static int bombX = 99, bombY = 99;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int ans = 0;
			// 테스트케이스 번호
			sc.nextInt();
			// 맵전체
			int startcnt = 0;
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					map[j][k] = sc.nextInt();
					if(j == 0 && map[j][k] == 1) {
						// 시작점의 개수
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
			// 모든 시작점을 끝까지 진행하고 횟수를 카운트하여 end배열에 저장한다.
			for (int j = 0; j < startcnt; j++) {
				visited = new boolean[100][100];
				int r = 0, c = 0;
				c = start[j];
				cnt = 0;
				visited[r][c] = true;
				while(r < 99) {
//					System.out.println(r +" / "+ c);
					// 왼쪽에 갈 수 있는 사다리가 있으면 내려가는 길이 있을때까지 직진
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
					// 오른쪽에 갈 수 있는 사다리가 있으면 내려가는 길이 있을때까지 직진
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
				// 가장작은 수가 ans
				if(min >= cnt) {
					min = cnt;
					ans = start[j];
				}
			}
			System.out.println("#"+(i+1)+" "+ans);
		}
	}
}
