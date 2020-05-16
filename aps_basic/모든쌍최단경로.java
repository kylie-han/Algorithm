import java.util.Arrays;

/**
최단경로 : 하나의 정점에서 다른 모든 정점을 방문하는 최단경로 - 다익스트라 

한 정점에서 다른 정점으로의 모든 경로의 길이를 구한 뒤, 그들 중에서 최소의 길이를 찾는다. - 브루트포스
각 점을 시작점으로 정하여 다익스트라의 최단경로 알고리즘을 수행한다. n*O(n^3)=O(n^3) 

모든 쌍 최단경로 : 어떤 정점에서  다른 정점을 방문하는 최단경로 - 플로이드-워샬
출발정점, 경유정점, 도착정점 사이의 간선을 확인하고 연결된 모든 

 */
public class 모든쌍최단경로 {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		// 간선배열을 입력으로 받고 그 간선 배열을 하나씩 확인하면서 최단경로로 업뎃한다.
		int[][] D ={{0,M,2,3},
					{4,0,1,8},
					{2,5,0,M},
					{M,9,6,0}};
		
		for (int k = 0; k < D.length; k++) {	// 경유정점
			for (int i = 0; i < D.length; i++) {	// 출발정점
				if (k == i) continue;
				for (int j = 0; j < D.length; j++) {	// 도착정점
					if (k == j || i == j) continue;
					
					if (D[i][k] != M && D[k][j] != M &&
							D[i][j] > D[i][k] + D[k][j]) {
						D[i][j] = D[i][k] + D[k][j];
					}
				}
			}
		}
		
		for (int i = 0; i < D.length; i++) {
			System.out.println(Arrays.toString(D[i]));
		}
		
		
	}
}
