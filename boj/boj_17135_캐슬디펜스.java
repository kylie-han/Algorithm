import java.util.Scanner;

public class boj_17135_캐슬디펜스 {
	static int[][] field;
	static int n;
	static int m;
	static int d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		field = new int[n + 1][m];
		for (int i = 0; i < field.length - 1; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = sc.nextInt();
			}
		}
		///////////// 입력///////////////
		dfs(0);
		// max 출력
		System.out.println(max);
	}// end of main

	static int[] arr = new int[3];
	static boolean[] used = new boolean[5];

	public static void dfs(int depth) {
		if (depth == 3) {
			killCnt(arr);
			return;
		} else {
			for (int i = 0; i < 5; i++) {
				if (used[i])
					continue;
				used[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				used[i] = false;
			}
		}
	}
	
	static int max = 0;
	static int[] reset  = new int[m];
	
	public static void killCnt(int[] arr2) {
		// 궁수 : field[n]행에 위치
		// 적 : field[0]~[n-1]행에 1로 위치
		boolean enemyDead = false;
		int cnt = 0;
		for (int k = 0; k < arr.length; k++) {
			for (int i = field.length-1; i >= n-d ; i--) {
				for (int j = 0; j < field[i].length; j++) {
					// 궁수는 d사정거리 안에 있는 적을 죽일 수 있다., 죽이면 : 1->0, cnt++;
					//격자판의 두 위치 궁수(n, arr[i]), 적(n-1:i, 0:j)의 거리는 |r1-r2| + |c1-c2|이다.
					if(field[i][j] == 1 && Math.abs(n-i)+Math.abs(arr[k]-j) <= d) {
						field[i][j] = 0;
						enemyDead = true;
					}
				}
			}
			if(enemyDead) {
				cnt++;
				continue;
			}
			// 조합내의 모든 궁수가 사격을 하면 field[n]->field[n-1];
			field[n-1] = reset;
			n--;
		}
		// 한 조합의 궁수가 사격한 후 cnt가 앞서 행했던 조합보다 크면 저장.
		if(cnt>max) max=cnt;
	}
}// end of class
