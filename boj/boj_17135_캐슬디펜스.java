import java.util.Scanner;

public class boj_17135_ĳ�����潺 {
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
		///////////// �Է�///////////////
		dfs(0);
		// max ���
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
		// �ü� : field[n]�࿡ ��ġ
		// �� : field[0]~[n-1]�࿡ 1�� ��ġ
		boolean enemyDead = false;
		int cnt = 0;
		for (int k = 0; k < arr.length; k++) {
			for (int i = field.length-1; i >= n-d ; i--) {
				for (int j = 0; j < field[i].length; j++) {
					// �ü��� d�����Ÿ� �ȿ� �ִ� ���� ���� �� �ִ�., ���̸� : 1->0, cnt++;
					//�������� �� ��ġ �ü�(n, arr[i]), ��(n-1:i, 0:j)�� �Ÿ��� |r1-r2| + |c1-c2|�̴�.
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
			// ���ճ��� ��� �ü��� ����� �ϸ� field[n]->field[n-1];
			field[n-1] = reset;
			n--;
		}
		// �� ������ �ü��� ����� �� cnt�� �ռ� ���ߴ� ���պ��� ũ�� ����.
		if(cnt>max) max=cnt;
	}
}// end of class
