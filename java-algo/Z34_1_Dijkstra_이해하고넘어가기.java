import java.util.Arrays;

/**
 * Dijkstra : �ϳ��� �������� ��� ���������� �ִ� �Ÿ��� ���ϴ� �˰��� ���� �ƴ� ����ġ�� ��츸 ���� O[N^2]
 * 
 *
 */
public class Z34_1_Dijkstra_�����ϰ�Ѿ�� {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		int[][] G = { // A : �������
				{ 0, 3, 5, M, M, M, }, 
				{ M, 0, 2, 6, M, M, }, 
				{ M, 1, 0, 4, 6, M, }, 
				{ M, M, M, 0, 2, 3, },
				{ 3, M, M, M, 0, 6, }, 
				{ M, M, M, M, M, 0, }, };
		int s = 0; // s : ���� ����
		int[] D = G[s]; // D : �Ÿ�
		boolean[] used = new boolean[G.length];
		used[s] = true;
		for (int n = 1; n < G.length; n++) {// �� ����Ŭ ���� ���� 1���� ���õ�
			// ������� ���� �����߿� �ּҰ���ġ ������ ã�Ƽ� �߰�
			int minIndex = -1;
			int min = M;
			for (int i = 0; i < D.length; i++) {
				if (!used[i] && min > D[i]) {
					minIndex = i;
					min = D[i];
				}
			}
			used[minIndex] = true;
			// ������ ������ ���� �� �� �ִ� �������� ����ġ�� �����ϱ�
			for (int i = 0; i < D.length; i++) {
//				������� ���� ���� &&������ ����&&����ġ�� ���ݺ��� ������
				if (!used[i] && G[minIndex][i] != M && D[i] > D[minIndex] + G[minIndex][i]) {
					D[i] = D[minIndex] + G[minIndex][i];
				}
			}
		}
		System.out.println(Arrays.toString(D));
	}// end of main
}// end of class
