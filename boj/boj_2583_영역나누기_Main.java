import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

class square {
	int r;
	int c;

	public square() {
	}

	public square(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

public class boj_2583_영역나누기_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<square> stack = new Stack<square>();
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] map = new int[r][c];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int sc = Integer.parseInt(st.nextToken());
			int sr = Integer.parseInt(st.nextToken());
			int ec = Integer.parseInt(st.nextToken());
			int er = Integer.parseInt(st.nextToken());
			for (int j = sr; j < er; j++) {
				for (int k = sc; k < ec; k++) {
					map[j][k] = 1;
				}
			}
		}
//		입력확인
//		for (int i = 0; i < map.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
		boolean[][] visitedArr = new boolean[map.length][map[0].length];
		int[] row = { -1, 1, 0, 0, };
		int[] col = { 0, 0, -1, 1, };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (!visitedArr[i][j] && map[i][j] == 0) {
					int cnt = 0;
					visitedArr[i][j] = true;
					stack.push(new square(i, j));
					while (!stack.isEmpty()) {
						square x = stack.pop();
						cnt++;
						for (int k = 0; k < col.length; k++) {
							if (x.r + row[k] >= 0 && x.r + row[k] < map.length && x.c + col[k] >= 0
									&& x.c + col[k] < map[0].length) {
								if (!visitedArr[x.r + row[k]][x.c + col[k]] && map[x.r + row[k]][x.c + col[k]] == 0) {
									visitedArr[x.r + row[k]][x.c + col[k]] = true;
									stack.push(new square(x.r + row[k], x.c + col[k]));
								}
							}
						}
					}
//					System.out.println(cnt);
					list.add(cnt);
				}
			}
		}
		list.sort(null);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}// end of main
}// end of class
