import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Now {
	int r;
	int c;
	char data;
	int step;
	public Now() {
	}
	public Now(int r, int c, char data, int step) {
		this.r = r;
		this.c = c;
		this.data = data;
		this.step = step;
	}
	@Override
	public String toString() {
		return "Now [r=" + r + ", c=" + c + ", data=" + data + ", step=" + step + "]";
	}
}
public class Boj_2178_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			String inData = br.readLine();
			map[i] = inData.toCharArray();
		}
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		/////////////////////�Է�///////////////////////////////
		int[] rAdd = {-1, 1, 0, 0};
		int[] cAdd = {0, 0, -1, 1};
		boolean[][] visited = new boolean[n][m];
		Queue<Now> q = new LinkedList<>();
		q.offer(new Now(0,0,map[0][0],1));
		visited[0][0] = true;
		while(!q.isEmpty()) {
			Now now = q.poll();
//			System.out.println(now);
			if (now.r == map.length-1 && now.c == map[0].length-1) {
				System.out.println(now.step);
				break;
			}else if (now.data == '1') {
				for (int i = 0; i < rAdd.length; i++) {
					if (now.r+rAdd[i] >=0 && now.c+cAdd[i] >=0 && now.r+rAdd[i] < n && now.c+cAdd[i] < m &&
							!visited[now.r+rAdd[i]][now.c+cAdd[i]] && map[now.r+rAdd[i]][now.c+cAdd[i]] == '1') {
						Now item = new Now(now.r+rAdd[i],now.c+cAdd[i],map[now.r+rAdd[i]][now.c+cAdd[i]],now.step+1);
						q.offer(item);
						visited[now.r+rAdd[i]][now.c+cAdd[i]] = true;
					}
				}
			}
		}//end of while
		
	}//end of main
}//end of class