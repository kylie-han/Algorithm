import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class hw_algo0506_서울_12반_한지혜 {
	static int[] t1 = {0,0,0,0,0,1,1,1,1,2,2,2,3,3,4};
	static int[] t2 = {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};
	static int[] win, draw, lose;
	static StringTokenizer st;
	static boolean f;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			win = new int[6];
			draw = new int[6];
			lose = new int[6];
			int game = 0;
			f = false;
			for (int j = 0; j < 6; j++) {
				win[j] = Integer.parseInt(st.nextToken());
				draw[j] = Integer.parseInt(st.nextToken());
				lose[j] = Integer.parseInt(st.nextToken());
				game += win[j] + draw[j] + lose[j];
			}// input
			
//			System.out.println(Arrays.toString(win));
//			System.out.println(Arrays.toString(draw));
//			System.out.println(Arrays.toString(lose));
//			System.out.println(game);
			
			if (game == 30) {
				dfs(0);
			}
			System.out.print((f?1:0)+" ");
		}
	}

	private static void dfs(int game) {
		if (f) return;
		if (game == 15) {
			f = true;
			return;
		}
		//이기는 경우
		if (win[t1[game]]>0 && lose[t2[game]]>0) {
			win[t1[game]]--;
			lose[t2[game]]--;
			dfs(game+1);
			win[t1[game]]++;
			lose[t2[game]]++;
		}
		// 비기는 경우
		if (draw[t1[game]]>0 && draw[t2[game]]>0) {
			draw[t1[game]]--;
			draw[t2[game]]--;
			dfs(game+1);
			draw[t1[game]]++;
			draw[t2[game]]++;
		}
		// 지는 경우
		if (lose[t1[game]]>0 && win[t2[game]]>0) {
			lose[t1[game]]--;
			win[t2[game]]--;
			dfs(game+1);
			lose[t1[game]]++;
			win[t2[game]]++;
		}
		return;
	}
}
