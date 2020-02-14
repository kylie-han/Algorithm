
//안도는 코드.......




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj_17135_캐슬디펜스_solution {
	private static int N;
	private static int M;
	private static int D;
	private static int num; // 적군의 총 인원수
	private static int[][] map;
	private static int[][] copyMap;
	private static TreeSet<int[]> set = new TreeSet<int[]>(new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {	//	외부 비교기
			if (o1[0] == o2[0] && o1[1] == o2[1]) {
				return 0; //같은 경우
			}else {
				return 1;	// 관심없음
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
					int cnt = go(comb); // 시뮬레이션 시작
					if (maxCnt < cnt)
						maxCnt = cnt;
				}
			}
		}
	}// end of main

	/**
	 * 
	 * @param comb : 궁수 위치
	 * @return 제거한 적의 인원
	 */
	public static int go(int[] comb) {
		int copyNum = num;	// 적의 인원 복사
		// 맵 복사
		for (int i = 0; i < map.length; i++) {
			copyMap[i] = map[i].clone();	//한 행씩 복사
		}
		// 제거한 궁수 세기
		int cnt = 0;
		
		while(copyNum > 0){	//	적이 남아있는 동안
			for (int i = 0; i < comb.length; i++) {	//	궁수가 순서대로 쏘기
ex:				for (int j = 1; j <= D; j++) {	// 공격거리
					int nr = N-1;
					int nc = comb[i] - j + 1;
					
					for (int k = 0; k < j; k++) {	//	우상 대각선
						if(0 <= nr && nr < N && 0 <= nc && nc < M
								&& copyMap[nr][nc] == 1){
							set.add(new int[] {nr, nc});	// 적의 죽은 위치 저장
							break ex;
						}
						nr--; nc++;
					}
					nr += 2;
					for (int k = 0; k < j-1; k++) {	//	우하 대각선
						if(0 <= nr && nr < N && 0 <= nc && nc < M
								&& copyMap[nr][nc] == 1){
							set.add(new int[] {nr, nc});	// 적의 죽은 위치 저장
							break ex;
						}
						nr++; nc++;
					}
				}
			}//궁수가 공격하는 for
			for (int[] v : set) {	//	중복이 자동으로 제거된다.
				int row = v[0];
				int col = v[1];
				copyMap[row][col] = 0;	// 맵에서 적군 삭제
				cnt++;	//	제거한 적의 인원
				copyNum--;	//적의 총 인원 갑소
			}
			set.clear();
			//	지도 한칸씩내리기
			copyNum -= down();
		}
		return cnt;
	}
	/**
	 * 맵을 한칸씩 내림, 맵 밖으로 나간 적은 제거
	 */
	public static int down() {
		int cnt = 0;	//	맵 밖으로 나간 적 인원
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
