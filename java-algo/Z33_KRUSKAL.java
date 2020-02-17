import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * MST �ּ� ����Ʈ�� �˰��� ������� : Ž�������� �ۼ��� �˰���, O[E logE] Prim : KRUSKAL : ������ ����
 * �׷������� ����, ������ ����ġ �������� �����ϴ� �۾��� ���� �����ɸ�(�߿�) ������ ����ġ�������� �������� ���� ����ġ�� ����
 * ����(V-1��)�� �����ذ���.(����Ŭ�� �������� �ʵ���) [input] ������ ���� V, ������ ���� E, ���� �����ٿ� E����
 * ��������(����1, ����2, ����ġ) 7 11 5 3 18 1 2 21 2 6 25 0 2 31 0 1 32 3 4 34 5 4 40 2 4
 * 46 0 6 51 4 6 51 0 5 60 [output] ������ �������� (����1-����2 ����ġ) ���, MST��ü ����ġ�� ��
 */
public class Z33_KRUSKAL {
	public static int[] p; // �θ� ����
	public static int[] rank; // ���� ����

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());

		Edge[] G = new Edge[E];
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			G[i] = new Edge(a, b, val);
		}
		Arrays.sort(G);
		////////////// �Է�///////////////////////
		// �� ������ ������ ����
		p = new int[V];
		rank = new int[p.length];
		for (int i = 0; i < p.length; i++) {
			makeSet(i);
		}
		// ����ġ�� �ּ��� ������ ���� V-1��
		int cnt = 0;
		int MST = 0; // �ּ� ����Ʈ���� ����ġ�� ���� ������ ����

		for (int i = 0; i < E; i++) {// ������ ������ ���� ������� ����
			Edge e = G[i];
			int px = findSet(e.a);
			int py = findSet(e.b);
			if (px != py) { // ����Ŭ�� ����� �ȵ� (DisjointSet)
				union(px, py);
				System.out.println(e);
				MST += e.val;
				cnt++;
				if (cnt == V - 1) {
					break;
				}
			}
		}
		System.out.println("KRUSKAL�� ���� MST�� ��ü ����ġ�� �� : " + MST);
	}// end of main

	/** px, py�� �����ϴ� �� ������ ���� */
	public static void union(int px, int py) {
		link(px, py);
	}

	/** rank(���̰�) �������� ��ħ */
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = p[px];
		} else {
			p[px] = p[py];
			if (rank[px] == rank[py]) {// ���� ������ ��� ��ũ�� �����Ѵ�.
				rank[py]++;
			}
		}
	}

	/** �Ϲ� �ع� x�� �����ϴ� ������ ��ǥ�ڸ� ���� */
	public static int findSet(int x) {
		if (p[x] == x) {
			return x;
		} else {
			p[x] = findSet(p[x]); // �н� ��������
			return 0;
		}
	}

	/** �Ϲݸ�� x�� �����ϴ� ���ο� ������ ���� */
	public static void makeSet(int x) {
		p[x] = x; // �θ� ����
	}

	public static class Edge implements Comparable<Edge> { // ���� �񱳱�
		int a;// ����1
		int b;// ����2
		int val;// ����ġ

		public Edge() {
			// TODO Auto-generated constructor stub
		}

		public Edge(int a, int b, int val) {
			super();
			this.a = a;
			this.b = b;
			this.val = val;
		}

		@Override
		public String toString() {
			return "(" + a + "," + b + "," + val + ")";
		}

		@Override
		public int compareTo(Edge o) { // ���� ������ �ۼ�
			// �� ��ü(this)�� �ܺΰ�ü(o)�� ��
			return this.val - o.val; // ����ġ �������� �������� ����
		}

	}
}// end of class
