
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bfs_0128 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		int[][] arr = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
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
//		private static void dfs(int[][] arr, boolean[] visited, int n, int v, int i) {
//			if (i == n) {
//				return;
//			} else {
//				visited[v] = true;
//				System.out.print(v + " ");
//				for (int j = 0; j < arr[0].length; j++) {
//					if (arr[v][j] == 1 && !visited[j]) {
//						dfs(arr, visited, n, j, i + 1);
//					}
//				}
//			}
//		}

}// end of class
