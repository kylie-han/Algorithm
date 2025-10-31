import java.util.Arrays;
import java.util.Scanner;

/*
7 11
0 1 2
0 2 2
0 5 8
1 2 1
1 3 19
2 5 5
3 4 7
3 5 11
3 6 15
4 5 9
4 6 3
 */

public class Edge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); // ������ ����
		int E = sc.nextInt(); // ������ ����
		int[][] adj = new int[V][V];
		// ������ ������ �޴´�
		for (int i = 0; i < E; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			adj[a][b] = c;
			adj[b][a] = c;
		}
		
		boolean[] check = new boolean[V];
		int[] key = new int[V]; // ���� ���õ� ������κ��� ������ �� �ִ� �ּҰŸ�
		int[] p = new int[V]; // �ּҽ���Ʈ���� ������ ������ �迭
		// key�� �ʱⰪ�� ���Ѵ�
		Arrays.fill(key, Integer.MAX_VALUE);
		
		// �ƹ��ų� �ϳ� ���� (ó�� ���õǴ� ģ���� ��Ʈ�̹Ƿ�, �θ�� ���°ɷ�, �Ÿ��� 0�ΰɷ�)
		p[0] = -1;
		key[0] = 0;
		// �̹� �ϳ� ������� ������ V-1���� �����
		for (int i = 0; i < V-1; i++) {
			int min = Integer.MAX_VALUE;
			// �Ȱ���� ģ���� �߿��� key�� ���� ������ ģ���� ����
			int index = -1; // ã���� �׳��� ��ġ�� ���⿡ �����Ұž�
			for (int j = 0; j < V; j++) {
				// �ϴ�, �� ������� �˻�, key�� �ּҰ��� ����ؾߵ� 
				if(!check[j] && key[j] < min) {
					index = j;
					min = key[j];
				}
			}
			// index : ������ �ȵ� ���� �� key�� ���� ���� ģ���� ����ִ�
			check[index] = true;
			// index �������� ����ϴ� ��� ������ ���ؼ� key�� ������Ʈ
			for (int j = 0; j < V; j++) {
				// check�� �ȵǾ������鼭, ������ �����ϰ�, �� ������ key������ �۴ٸ�, key ���� ������Ʈ
				if(!check[j] && adj[index][j] != 0 && key[j] > adj[index][j]) {
					p[j] = index;
					key[j] = adj[index][j];
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i < V; i++) {
			result += key[i];
		}
		System.out.println(result);
		System.out.println(Arrays.toString(p));
	}
}