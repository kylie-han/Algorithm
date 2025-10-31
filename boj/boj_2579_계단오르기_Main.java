import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2579_계단오르기_Main {
	static int N, ans;
	static int[][] stair;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		stair = new int[N][3];
		for (int i = 0; i < stair.length; i++) {
			stair[i][0] = Integer.parseInt(br.readLine());
		}
		if (N < 2) {
			ans = stair[0][0];
		} else {
			stair[0][1] = stair[0][0];
			stair[1][1] = stair[1][0] + stair[0][1];
			stair[1][2] = stair[1][0];
			for (int i = 2; i < stair.length; i++) {
				stair[i][1] = stair[i][0] + stair[i - 1][2];
				stair[i][2] = stair[i][0] + Math.max(stair[i - 2][1], stair[i - 2][2]);
			}
			ans = Math.max(stair[N - 1][1], stair[N - 1][2]);
		}
		System.out.println(ans);
	}
}
