import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * MST 풀이 kruskal 방법 
 * 인접리스트, Scanner : 1772ms 
 * 인접리스트, BufferedReader, StringTokenizer : 1056ms 
 * 인접행렬, BufferedReader, StringTokenizer : 1288ms
 * 
 *
 */
public class Boj_1197_Main {
	static int V, E;
	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		int[][] arr = new int[E + 1][3];
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		} // input
			// 간선을 가중치 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[2], o2[2]);
			}
		});
		// 확인
		parents = new int[V + 1];

		for (int i = 0; i < parents.length; i++) {
			makeSet(i);
		}
		int result = 0;
		int cnt = 0;
		// 정점의 갯수 -1 번 반복하면서 간선이 연결하는 두 정점이 같은 팀이 아니라면, 팀장이 다르면 선택, 병합
		// 같은 팀 : continue;
		for (int i = 0; i < E; i++) {
			int a = findSet(arr[i][0]);
			int b = findSet(arr[i][1]);
			if (a == b)
				continue;
			union(a, b);
			result += arr[i][2];
			cnt++;
			if (cnt == V - 1)
				break;
		}
		System.out.println(result);
	}

	private static void makeSet(int x) {
		parents[x] = x;
	}

	private static int findSet(int x) {
		if (parents[x] == x)
			return x;
		else {
			return findSet(parents[x]);
		}
	}

	private static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		parents[px] = py;
	}
}
