
//�ȵ��� �ڵ�.......




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj_17135_ĳ�����潺_solution {
	private static int N;
	private static int M;
	private static int D;
	private static int num; // ������ �� �ο���
	private static int[][] map;
	private static int[][] copyMap;
	private static TreeSet<int[]> set = new TreeSet<int[]>(new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {	//	�ܺ� �񱳱�
			if (o1[0] == o2[0] && o1[1] == o2[1]) {
				return 0; //���� ���
			}else {
				return 1;	// ���ɾ���
			}
		}
	});

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());

		map = new int[N + 1][M];
		copyMap = new int[N + 1][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0, index = 0; j < M; j++, index += 2) {
				map[i][j] = str.charAt(index) - '0';
				if (map[i][j] == 1)
					num++;
			}
		}

		int[] comb = new int[3];
		int maxCnt = 0;
		for (comb[0] = 0; comb[0] < M - 2; comb[0]++) {
			for (comb[1] = comb[0] + 1; comb[1] < M - 1; comb[1]++) {
				for (comb[2] = comb[1] + 1; comb[2] < M; comb[2]++) {
					int cnt = go(comb); // �ùķ��̼� ����
					if (maxCnt < cnt)
						maxCnt = cnt;
				}
			}
		}
	}// end of main

	/**
	 * 
	 * @param comb : �ü� ��ġ
	 * @return ������ ���� �ο�
	 */
	public static int go(int[] comb) {
		int copyNum = num;	// ���� �ο� ����
		// �� ����
		for (int i = 0; i < map.length; i++) {
			copyMap[i] = map[i].clone();	//�� �྿ ����
		}
		// ������ �ü� ����
		int cnt = 0;
		
		while(copyNum > 0){	//	���� �����ִ� ����
			for (int i = 0; i < comb.length; i++) {	//	�ü��� ������� ���
ex:				for (int j = 1; j <= D; j++) {	// ���ݰŸ�
					int nr = N-1;
					int nc = comb[i] - j + 1;
					
					for (int k = 0; k < j; k++) {	//	��� �밢��
						if(0 <= nr && nr < N && 0 <= nc && nc < M
								&& copyMap[nr][nc] == 1){
							set.add(new int[] {nr, nc});	// ���� ���� ��ġ ����
							break ex;
						}
						nr--; nc++;
					}
					nr += 2;
					for (int k = 0; k < j-1; k++) {	//	���� �밢��
						if(0 <= nr && nr < N && 0 <= nc && nc < M
								&& copyMap[nr][nc] == 1){
							set.add(new int[] {nr, nc});	// ���� ���� ��ġ ����
							break ex;
						}
						nr++; nc++;
					}
				}
			}//�ü��� �����ϴ� for
			for (int[] v : set) {	//	�ߺ��� �ڵ����� ���ŵȴ�.
				int row = v[0];
				int col = v[1];
				copyMap[row][col] = 0;	// �ʿ��� ���� ����
				cnt++;	//	������ ���� �ο�
				copyNum--;	//���� �� �ο� ����
			}
			set.clear();
			//	���� ��ĭ��������
			copyNum -= down();
		}
		return cnt;
	}
	/**
	 * ���� ��ĭ�� ����, �� ������ ���� ���� ����
	 */
	public static int down() {
		int cnt = 0;	//	�� ������ ���� �� �ο�
		for (int c = 0; c < M; c++) {
			if (copyMap[N-1][c] == 1) {
				cnt++;
				copyMap[N-1][c] = 0;
			}
		}
		int[] temp = copyMap[N-1];
		for (int r = N-1; r > 0; r--) {
			copyMap[r] = copyMap[r-1];
		}
		copyMap[0] = temp;
		return cnt;
	}
}// end of class
