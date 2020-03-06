import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution_SWEA_7699_수지의수지맞는여행_kylie {
	static StringTokenizer st;
	static int result;
	static int r, c;
	static char[][] island;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static boolean[][] visited;
	static Set<Character> set = new HashSet<Character>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			result = 0;
			set.clear();
			st = new StringTokenizer(br.readLine(), " ");
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			island = new char[r][c];
			visited = new boolean[r][c];
			for (int i = 0; i < r; i++) {
				String str = br.readLine();
				for (int j = 0; j < c; j++) {
					island[i][j] = str.charAt(j);
				}
			}
			visited[0][0] = true;
			set.add(island[0][0]);
			dfs(0, 0, 0);
			System.out.println("#" + t + " " + result);
		}
	}

	private static void dfs(int row, int col, int depth) {
		if(result==26) return;
		if (result < set.size()) {
			result = set.size();
		}
		// 사방체크해서 내가 보지 않은 명물이 있다면 값을 증가시키고
		for (int i = 0; i < dc.length; i++) {
			if (row + dr[i] < 0 || row + dr[i] >= r || col + dc[i] < 0 || col + dc[i] >= c
					|| visited[row + dr[i]][col + dc[i]]) {
				continue;
			} else {
				if (!set.contains(island[row + dr[i]][col + dc[i]])) {
					// 방문체크
					visited[row + dr[i]][col + dc[i]] = true;
					// 지금 보고 있는 명물을 set에 저장한다.
					set.add(island[row + dr[i]][col + dc[i]]);
					// 명물을 보러 가서 다음 스텝을 진행한다.
					dfs(row + dr[i], col + dc[i], depth + 1);
					// 다음 스텝을 위한 원복
					visited[row + dr[i]][col + dc[i]] = false;
					set.remove(island[row + dr[i]][col + dc[i]]);
				}
			}
		}
	}
}
