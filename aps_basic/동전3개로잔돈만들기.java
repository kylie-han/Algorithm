import java.util.Arrays;
import java.util.Scanner;

/**
 * �׸���� �ǵ��� �� ���� ���� ���� �� ������ ���� ������ ���� �� ����
 * 
 * 
 * 8�� �ܵ��� ���� �˰���
 * 3���� ���� ������ �����ؼ� ��������� �ذ�
 * 1. 1�� ���� �Ѱ� +7�������� ���� ������
 * 2. 4�� ���� �Ѱ� +4�������� ���� ������
 * 3. 6�� ���� �Ѱ� +2�������� ���� ������
 * =>call tree �׷�����
 * 
 * 1���� �迭�� ������Ʈ �ؼ� ���� �Ž����� ������ �����غ���
 */
public class ����3�����ܵ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// input
		
		int[] C = new int[N+1];
		
		for (int i = 0; i < C.length; i++) {
			C[i] = i;	// 1��¥�� �ʿ��� ���� 
			
		}
		System.out.println(Arrays.toString(C));
		// 1, 4��¥���� ��� ���
		for (int i = 4; i < C.length; i++) {
			// C[i] : ���� 1��¥�� ������ ����� �ּҰ���
			// C[i-4]+1 : 1, 4��¥�� ����� �ּҰ���
			if (C[i] > C[i-4]+1 ) { 
				C[i] = C[i-4]+1; 
			}
		}
		System.out.println(Arrays.toString(C));
		// 1, 4, 6��¥���� ��� ���
		for (int i = 6; i < C.length; i++) {
			// C[i] : ���� 1, 4��¥�� ������ ����� �ּҰ���
			// C[i-6]+1 : 1, 4, 6��¥�� ����� �ּҰ���
			if (C[i] > C[i-6]+1 ) { 
				C[i] = C[i-6]+1; 
			}
		}
		System.out.println(Arrays.toString(C));
		sc.close();
	}
}
