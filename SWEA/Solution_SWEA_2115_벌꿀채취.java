import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_2115_����ä�� {
	
	static int N,M,C;	// N : ������� �迭����, M : ��Ȯ�� �� �ִ� ���ӵ� ���� ����, C : �� �뿡 ���� �� �ִ� ���� ��
	static int[][] map, maxMap;	// map : �����
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
			
			//1. �� i,j��ġ���� ���ӵ� M���� ����Ͽ� ���� �� �ִ� �κ������� �ִ����� ���
			makeMaxMap();
			//2. �� �ϲ� ����
			System.out.println("#"+t+" "+getMaxBenefit());
		}
	}//end of main
	private static void makeMaxMap() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {	//���ӵ� M���� �����Ұǵ� �迭�� ������ ����� �ʱ� ���� N-M
				makeMaxSubset(i, j, 0, 0, 0);
			}
		}
	}
	/**
	 * 
	 * @param i : �� ��ġ
	 * @param j : �� ��ġ
	 * @param cnt : ����� ���Ҽ�
	 * @param sum : �κ����տ� ���� ������ ��
	 * @param powSum : �κ����տ� ���� ������ ����
	 */
	private static void makeMaxSubset(int i, int j, int cnt, int sum, int powSum) {
		if(sum > C) return;	// �κ������� ���� ��ǥ��C�� �ʰ��ϸ� ���� 
		if (cnt == M) {
			// 0,0 M=2
			// 0,0 : 0/ 0,1 : 1/ 0,2 : 2
			if (maxMap[i][j-M] < powSum) {
				maxMap[i][j-M] = powSum;
			}
			return;
		}
		//i, j ��ġ ���� ����
		makeMaxSubset(i, j + 1, cnt + 1, sum + map[i][j], powSum + map[i][j] * map[i][j]);
		//i, j ��ġ ���� ����
		makeMaxSubset(i, j + 1, cnt + 1, sum, powSum);
	}
	
	private static int getMaxBenefit() {
		int max = 0, temp = 0;
		// 1. �ϲ�A ���� ����
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N-M; j++) {
				// 2. �ϲ�B ����
				// ���� �� ���� ����
				for (int j2 = j+M; j2 <= N-M; j2++) {
					temp = maxMap[i][j] + maxMap[i][j2];	// �� �ϲ� ������ �ִ�����
					if (max < temp) {
						max = temp;
					}
				}
				// ��������� ������ ����� ����
				for (int i2 = i+1; i2 < N; i2++) {
					for (int j2 = 0; j2 <= N-M; j2++) {
						temp = maxMap[i][j] + maxMap[i2][j2];	// �� �ϲ� ������ �ִ�����
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














