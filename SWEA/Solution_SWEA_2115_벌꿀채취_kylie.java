import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_2115_벌꿀채취_kylie {
	static int n, m, c;
	static int[][] map;
	static int[][] maxMap;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			map = new int[n][n];
			maxMap = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
//				System.out.println(Arrays.toString(map[i]));
			}
			// 1. 벌꿀통에서 꿀을 퍼낼 두 곳을 정하고
			makeMaxMap();
//			for (int i = 0; i < n; i++) {
//				System.out.println(Arrays.toString(map[i]));
//			}
//			for (int i = 0; i < n; i++) {
//				System.out.println(Arrays.toString(maxMap[i]));
//			}
			// 2. 정한 곳에서 최댓값을 계산해 출력한다.
			System.out.println("#" + t + " " + getMaxBenefit());
		}
	}// end of main

	public static int getMaxBenefit() {
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - m + 1; j++) {
				for (int j2 = j + m; j2 < n - m + 1; j2++) {
					if (maxMap[i][j] + maxMap[i][j2] > max)
						max = maxMap[i][j] + maxMap[i][j2];
				}
			}
			for (int i2 = i + 1; i2 < n; i2++) {
				for (int j = 0; j < n - m + 1; j++) {
					for (int j2 = 0; j2 < n - m + 1; j2++) {
						if (maxMap[i][j] + maxMap[i2][j2] > max)
							max = maxMap[i][j] + maxMap[i2][j2];
					}
				}
			}
		}
		return max;
	}

	public static void makeMaxMap() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - m + 1; j++) {
				makeSubset(i, j, 0, 0, 0);
			}
		}
	}

	public static void makeSubset(int i, int j, int cnt, int sum, int powSum) {
		if (sum > c)
			return;
		if (cnt == m) {
			if (maxMap[i][j - m] <= powSum) {
				maxMap[i][j - m] = powSum;
			} else
				return;
		} else {
			// 선택
			makeSubset(i, j + 1, cnt + 1, sum + map[i][j], powSum + map[i][j] * map[i][j]);
			// 비선택
			makeSubset(i, j + 1, cnt + 1, sum, powSum);
		}
	}
}// end of class
