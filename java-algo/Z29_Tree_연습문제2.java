import java.util.Arrays;
import java.util.Scanner;

/**
 * Ʈ���� ǥ�� - ������ ������ȸ ���� 4�� ����Ʈ�� ��Ʈ�� ������ ��ȣ 1
 * 
 * @author multicampus
 * 
 *         13 1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 *
 */
public class Z29_Tree_��������2 {
//						����Ʈ���� ������ 4�̸�, �ִ�Ʈ�������� �Ѱ����� 2^5�� ���ϴ�.
	public static int[] tree = new int[32]; // �������� �ڽ��� ������ ����, 0�� ������ ������

	public static void main(String[] args) {
		// ����Ʈ�� �ۼ�
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		tree[1] = 1; // ��Ʈ ������ȣ�� ����
		for (int i = 1; i < v; i++) {// v-1�� �ݺ�
			int p = sc.nextInt(); // ������ ��������
			int c = sc.nextInt(); // ������ �� ����

			// p�� ���� �������� ã��
			int j = -1;
			for (j = 1; j < tree.length; j++) {
				if (p == tree[j]) {// ���� �� ã��
					break;
				}
			}
//			j ������ �ڽ����� ���, ������ ������, �����ڽ����� ���, ������ ������ �������ڽ����� ���
			if (tree[j * 2] == 0) {// �����ڽ�?
				tree[j * 2] = c;
			} else { // �������ڽ����� ���
				tree[j * 2 + 1] = c;
			}
		}
		// ������ȸ
		System.out.print("\n������ȸ : ");
		preOrder(1);
		// ������ȸ
		System.out.print("\n������ȸ : ");
		inOrder(1);
		// ������ȸ
		System.out.print("\n������ȸ : ");
		postOrder(1);
	}// end of main

	/** ���� ��ȸ ����Լ� */
	public static void postOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // �迭������ ����ų� �ڽ��� ������
			return;
		}
		// �����ڽ�
		preOrder(index * 2);
		// �������ڽ�
		preOrder(index * 2 + 1);
		// �θ�
		System.out.print(tree[index] + " ");
	}

	/** ���� ��ȸ ����Լ� */
	public static void inOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // �迭������ ����ų� �ڽ��� ������
			return;
		}
		// �����ڽ�
		preOrder(index * 2);
		// �θ�
		System.out.print(tree[index] + " ");
		// �������ڽ�
		preOrder(index * 2 + 1);
	}

	/** ���� ��ȸ ����Լ� */
	public static void preOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // �迭������ ����ų� �ڽ��� ������
			return;
		}
		// �θ�
		System.out.print(tree[index] + " ");
		// �����ڽ�
		preOrder(index * 2);
		// �������ڽ�
		preOrder(index * 2 + 1);
	}
}// end of class
