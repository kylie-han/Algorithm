import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1780_�����ǰ���_Main {
	static int N,zero,one,minus;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		zero = 0;
		one = 0;
		minus = 0;
		paper(N,0,0);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
		
	}
	private static void paper(int n, int i, int j) {
		//n�� 1�̸� �迭�� ���� ���� color�� ����
		if(n <= 1) { 
			switch (arr[i][j]) {
			case -1:
				minus++;
				break;
			case 0:
				zero++;
				break;
			case 1:
				one++;
				break;

			default:
				break;
			}
		}else {
			// �������� ���� ����
			int start = arr[i][j];
			// ���۰� �ٸ� ���� �ִ��� Ȯ���ϴ� flag
			boolean flag = false;
			// flag�� true�� ����
			for (int x = i; x < i+n; x++) {
				if(flag) break;
				for (int y = j; y < j+n; y++) {
					if(start != arr[x][y]) {
						flag = true;
						break;
					}
				}
			}
			if(flag) {
				for (int k = 0; k < 9; k++) {
					j+=(k%3)*(n/3);
					i+=(k/3)*(n/3);
					paper(n/3,i,j);
					j-=(k%3)*(n/3);
					i-=(k/3)*(n/3);
				}
			}else {
				switch (start) {
				case -1:
					minus++;
					break;
				case 0:
					zero++;
					break;
				case 1:
					one++;
					break;

				default:
					break;
				}
			}
		}
	}
}
