import java.util.Scanner;

/**
 * 가중치 없는 방향그래프가 주어졌을 때, 모든 정점에 대해서, i에서 j로 가는 경로가 있는지 구하는 프로그램을 작성하시오
 */
public class boj_11403_경로찾기_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] D = new int [N][N];
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D.length; j++) {
				D[i][j] = sc.nextInt();
			}
		}
		
		for (int k = 0; k < D.length; k++) {
			for (int i = 0; i < D.length; i++) {
				for (int j = 0; j < D.length; j++) {
					if (D[k][j] != 0 && D[i][k] != 0)
						D[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[0].length; j++) {
				System.out.print(D[i][j] + " ");
			}System.out.println();
		}
	}
}
