import java.util.Scanner;

/**
 * ����ġ ���� ����׷����� �־����� ��, ��� ������ ���ؼ�, i���� j�� ���� ��ΰ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
public class boj_11403_���ã��_Main {
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
