import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1260_dfs¿Íbfs_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}

		boolean[] visited = new boolean[arr.length];
		dfs_stack(arr, visited, V);
		System.out.println();

		visited = new boolean[arr.length];
		bfs(arr, visited, V);

	}// end of main

	private static void bfs(int[][] arr, boolean[] visited, int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visited[v] = true;
		while (!q.isEmpty()) {
			v = q.poll();
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[v][j] == 1 && !visited[j]) {
					q.offer(j);
					visited[j] = true;
				}
			}
			System.out.print(v + " ");
		}
	}

	private static Stack<Integer> s = new Stack<>();

	private static void dfs_stack(int[][] arr, boolean[] visited, int v) {
		s.push(v);
		visited[v] = true;
		System.out.print(v + " ");
		v = s.pop();
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[v][i] == 1 && !visited[i]) {
				dfs_stack(arr, visited, i);

			}
		}
		return;
	}
//	private static void dfs(int[][] arr, boolean[] visited, int n, int v, int i) {
//		if (i == n) {
//			return;
//		} else {
//			visited[v] = true;
//			System.out.print(v + " ");
//			for (int j = 0; j < arr[0].length; j++) {
//				if (arr[v][j] == 1 && !visited[j]) {
//					dfs(arr, visited, n, j, i + 1);
//				}
//			}
//		}
//	}

}// end of class
