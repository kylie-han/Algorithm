import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_2115_벌꿀채취 {
	
	static int N,M,C;	// N : 벌통들의 배열개수, M : 수확할 수 있는 연속된 벌통 개수, C : 한 통에 담을 수 있는 꿀의 양
	static int[][] map, maxMap;	// map : 벌통들
								// maxMap : i,j
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			maxMap = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}//end input
			
			//1. 각 i,j위치에서 연속된 M개를 고려하여 취할 수 있는 부분집합의 최대이익 계산
			makeMaxMap();
			//2. 두 일꾼 조합
			System.out.println("#"+t+" "+getMaxBenefit());
		}
	}//end of main
	private static void makeMaxMap() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {	//연속된 M개를 선택할건데 배열의 밖으로 벗어나지 않기 위한 N-M
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
	}
	/**
	 * 
	 * @param i : 행 위치
	 * @param j : 열 위치
	 * @param cnt : 고려한 원소수
	 * @param sum : 부분집합에 속한 원소의 합
	 * @param powSum : 부분집합에 속한 원소의 이익
	 */
	private static void makeMaxSubset(int i, int j, int cnt, int sum, int powSum) {
		if(sum > C) return;	// 부분집합의 합이 목표량C를 초과하면 리턴 
		if (cnt == M) {
			// 0,0 M=2
			// 0,0 : 0/ 0,1 : 1/ 0,2 : 2
			if (maxMap[i][j-M] < powSum) {
				maxMap[i][j-M] = powSum;
			}
			return;
		}
		//i, j 위치 원소 선택
		makeMaxSubset(i, j + 1, cnt + 1, sum + map[i][j], powSum + map[i][j] * map[i][j]);
		//i, j 위치 원소 비선택
		makeMaxSubset(i, j + 1, cnt + 1, sum, powSum);
	}
	
	private static int getMaxBenefit() {
		int max = 0, temp = 0;
		// 1. 일꾼A 기준 선택
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {
				// 2. 일꾼B 선택
				// 같은 행 기준 선택
				for (int j2 = j+M; j2 <= N-M; j2++) {
					temp = maxMap[i][j] + maxMap[i][j2];	// 두 일꾼 조합의 최대이익
					if (max < temp) {
						max = temp;
					}
				}
				// 다음행부터 마지막 행까지 선택
				for (int i2 = i+1; i2 < N; i2++) {
					for (int j2 = 0; j2 <= N-M; j2++) {
						temp = maxMap[i][j] + maxMap[i2][j2];	// 두 일꾼 조합의 최대이익
						if (max < temp) {
							max = temp;
						}
					}
				}
			}
		}
		return max;
	}
}//end of class














