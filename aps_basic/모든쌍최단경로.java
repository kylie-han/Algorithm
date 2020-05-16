import java.util.Arrays;

/**
�ִܰ�� : �ϳ��� �������� �ٸ� ��� ������ �湮�ϴ� �ִܰ�� - ���ͽ�Ʈ�� 

�� �������� �ٸ� ���������� ��� ����� ���̸� ���� ��, �׵� �߿��� �ּ��� ���̸� ã�´�. - ���Ʈ����
�� ���� ���������� ���Ͽ� ���ͽ�Ʈ���� �ִܰ�� �˰����� �����Ѵ�. n*O(n^3)=O(n^3) 

��� �� �ִܰ�� : � ��������  �ٸ� ������ �湮�ϴ� �ִܰ�� - �÷��̵�-����
�������, ��������, �������� ������ ������ Ȯ���ϰ� ����� ��� 

 */
public class �����ִܰ�� {
	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		// �����迭�� �Է����� �ް� �� ���� �迭�� �ϳ��� Ȯ���ϸ鼭 �ִܰ�η� �����Ѵ�.
		int[][] D ={{0,M,2,3},
					{4,0,1,8},
					{2,5,0,M},
					{M,9,6,0}};
		
		for (int k = 0; k < D.length; k++) {	// ��������
			for (int i = 0; i < D.length; i++) {	// �������
				if (k == i) continue;
				for (int j = 0; j < D.length; j++) {	// ��������
					if (k == j || i == j) continue;
					
					if (D[i][k] != M && D[k][j] != M &&
							D[i][j] > D[i][k] + D[k][j]) {
						D[i][j] = D[i][k] + D[k][j];
					}
				}
			}
		}
		
		for (int i = 0; i < D.length; i++) {
			System.out.println(Arrays.toString(D[i]));
		}
		
		
	}
}
