import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * MST 최소 신장트리 알고리즘 공통사항 : 탐욕기법으로 작성된 알고리즘, O[E logE] Prim : KRUSKAL : 간선이 적은
 * 그래프에서 유리, 간선을 가중치 기준으로 정렬하는 작업이 가장 오래걸림(중요) 간선을 가중치기준으로 오름차순 정렬 가중치가 작은
 * 간선(V-1개)을 선택해간다.(사이클이 존재하지 않도록) [input] 정점의 개수 V, 간선의 개수 E, 이후 다음줄에 E개의
 * 간선정보(정점1, 정점2, 가중치) 7 11 5 3 18 1 2 21 2 6 25 0 2 31 0 1 32 3 4 34 5 4 40 2 4
 * 46 0 6 51 4 6 51 0 5 60 [output] 선택한 간선정보 (정점1-정점2 가중치) 출력, MST전체 가중치의 합
 */
public class Z33_KRUSKAL {
	public static int[] p; // 부모 정점
	public static int[] rank; // 깊이 저장

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
		////////////// 입력///////////////////////
		// 각 정점의 집합을 생성
		p = new int[V];
		rank = new int[p.length];
		for (int i = 0; i < p.length; i++) {
			makeSet(i);
		}
		// 가중치가 최소인 간선을 선택 V-1번
		int cnt = 0;
		int MST = 0; // 최소 신장트리의 가중치의 합을 누적할 변수

		for (int i = 0; i < E; i++) {// 간선을 정렬해 놓은 순서대로 검토
			Edge e = G[i];
			int px = findSet(e.a);
			int py = findSet(e.b);
			if (px != py) { // 사이클이 생기면 안됨 (DisjointSet)
				union(px, py);
				System.out.println(e);
				MST += e.val;
				cnt++;
				if (cnt == V - 1) {
					break;
				}
			}
		}
		System.out.println("KRUSKAL로 구한 MST의 전체 가중치의 합 : " + MST);
	}// end of main

	/** px, py를 포함하는 두 집합을 통합 */
	public static void union(int px, int py) {
		link(px, py);
	}

	/** rank(깊이값) 기준으로 합침 */
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = p[px];
		} else {
			p[px] = p[py];
			if (rank[px] == rank[py]) {// 같은 깊이인 경우 랭크가 증가한다.
				rank[py]++;
			}
		}
	}

	/** 일반 멈버 x를 포함하는 집합의 대표자를 리턴 */
	public static int findSet(int x) {
		if (p[x] == x) {
			return x;
		} else {
			p[x] = findSet(p[x]); // 패스 컴프레션
			return 0;
		}
	}

	/** 일반멤버 x를 포함하는 새로운 집합을 생성 */
	public static void makeSet(int x) {
		p[x] = x; // 부모를 저장
	}

	public static class Edge implements Comparable<Edge> { // 내부 비교기
		int a;// 정점1
		int b;// 정점2
		int val;// 가중치

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
		public int compareTo(Edge o) { // 비교할 기준을 작성
			// 내 객체(this)와 외부객체(o)를 비교
			return this.val - o.val; // 가중치 기준으로 오름차순 정렬
		}

	}
}// end of class
