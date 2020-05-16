import java.util.Arrays;
import java.util.Scanner;

public class Prim {
	static boolean[] visited;
	static int[] key, p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int[][] adj = new int[V][V];
		visited = new boolean[V];
		key = new int[V];
		p = new int[V];
		for (int i = 0; i < V; i++) {
			key[i] = 99;
			p[i] = -1;
		}
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(key));
		p[0] = -1;
		key[0] = 0;
		// 하나 고른 상태
		for (int i = 0; i < V; i++) {
			int min = Integer.MIN_VALUE;
			// 안골라진 친구중에서 key가 가장 작은 친구
			int index = -1;
			for (int j = 0; j < V; j++) {
				if (!visited[j] && key[j] < min) {
					index = j;
					min = key[j];
				}
			}
			visited[index] = true;
			for (int j = 0; j < V; j++) {
				if (!visited[j] && adj[index][j] != 0 && key[j] > adj[index][j]) {
					p[j] = index;
					key[j] = adj[index][j];
				}
			}
		}
		int result = 0;
		for (int i = 0; i < adj.length; i++) {
			result += key[i];
		}
		System.out.println(result);
		System.out.println(Arrays.toString(p));
	}
}
