import java.util.Arrays;

/**
 * Dijkstra : 하나의 정점에서 모든 정점까지의 최단 거리를 구하는 알고리즘 음이 아닌 가중치일 경우만 가능 O[N^2]
 * 
 *
 */
public class Z34_1_Dijkstra_이해하고넘어가기 {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		int[][] G = { // A : 인접행렬
				{ 0, 3, 5, M, M, M, }, 
				{ M, 0, 2, 6, M, M, }, 
				{ M, 1, 0, 4, 6, M, }, 
				{ M, M, M, 0, 2, 3, },
				{ 3, M, M, M, 0, 6, }, 
				{ M, M, M, M, M, 0, }, };
		int s = 0; // s : 시작 정점
		int[] D = G[s]; // D : 거리
		boolean[] used = new boolean[G.length];
		used[s] = true;
		for (int n = 1; n < G.length; n++) {// 한 사이클 돌면 정점 1개가 선택됨
			// 사용하지 않은 정점중에 최소가중치 정점을 찾아서 추가
			int minIndex = -1;
			int min = M;
			for (int i = 0; i < D.length; i++) {
				if (!used[i] && min > D[i]) {
					minIndex = i;
					min = D[i];
				}
			}
			used[minIndex] = true;
			// 선택한 정점을 통해 갈 수 있는 정점들의 가중치를 갱신하기
			for (int i = 0; i < D.length; i++) {
//				사용하지 않은 정점 &&인접한 정점&&가중치가 지금보다 작으면
				if (!used[i] && G[minIndex][i] != M && D[i] > D[minIndex] + G[minIndex][i]) {
					D[i] = D[minIndex] + G[minIndex][i];
				}
			}
		}
		System.out.println(Arrays.toString(D));
	}// end of main
}// end of class
