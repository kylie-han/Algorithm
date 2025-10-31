//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class Solution_SWEA_1251_ÇÏ³ª·Î_D4 {
//	static int N, L, E;
//	static int[][] input;
//	static int[] parents;
//	static int[] rank;
//
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int tc = Integer.parseInt(br.readLine());
//		
//		for (int t = 1; t <= tc; t++) {
//			N = Integer.parseInt(br.readLine());
//			
//			input = new int[2][N];
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for (int i = 0; i < N; i++) {
//				input[0][i] = Integer.parseInt(st.nextToken());
//			}
//			st = new StringTokenizer(br.readLine());
//			for (int i = 0; i < N; i++) {
//				input[1][i] = Integer.parseInt(st.nextToken());
//			}
//			E = Integer.parseInt(br.readLine());
//
//			System.out.println("--------------input------------");
//
//			Arrays.sort(input, new Comparator<int[]>() {
//
//				@Override
//				public int compare(int[] o1, int[] o2) {
//					// TODO Auto-generated method stub
//					return Integer.compare(, y);
//				}
//			});
//		} // end of testcase
//	} // end of main
//	static void makeSet(int x) {
//		parents[x] = x;
//	}
//	static int findSet(int x) {
//		if (x == parents[x])
//			return x;
//		else {
//			parents[x] = findSet(parents[x]);
//			return parents[x];
//		}
//	}
//	static void union(int x, int y) {
//		int px = findSet(x);
//		int py = findSet(y);
//		if (rank[px] > rank[py]) {
//			parents[py] = px;
//		}else {
//			parents[px] = py;
//			if (parents[px] == rank[py]) {
//				rank[py]++;
//			}
//		}
//	}
//} // end of class


