import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2630_색종이만들기_Main {
	static int N;
	static int[] color;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// color[0] = white, color[1] = blue
		color = new int[2];
		paper(N,0,0);
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
	}
	private static void paper(int n, int i, int j) {
		//n이 1이면 배열의 값에 따라 color에 저장
		if(n <= 1) { 
			color[arr[i][j]]++;
		}else {
			// 시작점의 색을 저장
			int start = arr[i][j];
			// 시작과 다른 색이 있는지 확인하는 flag
			boolean flag = false;
			// flag가 true면 중지
			for (int x = i; x < i+n; x++) {
				if(flag) break;
				for (int y = j; y < j+n; y++) {
					if(start != arr[x][y]) {
						flag = true;
						break;
					}
				}
			}
			if(flag) {
				for (int k = 0; k < 4; k++) {
					if(k%2 == 1) j+=n/2;
					if(k>1) i+=n/2;
					paper(n/2,i,j);
					if(k%2 == 1) j-=n/2;
					if(k>1) i-=n/2;
				}
			}else {
				color[start]++;
			}
		}
	}
}
