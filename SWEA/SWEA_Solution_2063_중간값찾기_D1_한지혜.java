import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_2063_�߰���ã��_D1_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TN = sc.nextInt();	//������ ���� ����
		int[] arr = new int[TN];//���� ������ŭ�� �迭 ����, �迭�� �⺻���� 0���� ä�����ִ�.
		//�Է¹��� ���� �迭�� �ְ�
		for (int i = 0; i < TN; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		//�� �迭�� �����Ѵ�
		Arrays.sort(arr);
		//������ �߰������
		System.out.println(arr[TN/2]);
	}
}
