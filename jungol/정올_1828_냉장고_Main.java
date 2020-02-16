import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정올_1828_냉장고_Main {
	public static class Point implements Comparable<Point> {
		int min;
		int max;

		public Point(int min, int max) {
			this.min = min;
			this.max = max;
		}

		@Override
		public int compareTo(Point o) {
			return this.max - o.max;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Point[] ref = new Point[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ref[i] = new Point(a, b);
		}
		///////////// 입력/////////////////
		int cnt = 1;
		Arrays.sort(ref);
		Point p = ref[0];
		for (int i = 1; i < N; i++) {
			if (ref[i].min > p.max) {
				p = ref[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}// end of main
}// end of class
