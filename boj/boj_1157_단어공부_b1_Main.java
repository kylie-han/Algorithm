import java.util.Scanner;
//�Էµ� ���ڿ����� ���� ���� ���� ���ĺ��� ���(�빮��)
public class boj_1157_�ܾ����_b1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];	// ���ĺ� ������ŭ�� �迭(26��)
		// �Էµ� ���ڿ��� ���ĺ���ġ�� ���� ��������
		for (char c : str.toCharArray()) {
			int i = (c-'A')%32;
			arr[i]++;
		}
		//�迭���� �ִ��� ���� �ִ� �ε����� ã��
		int index = 0;
		int max = arr[index];
		boolean f = false;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				index = i;max = arr[i]; f = false;
			}else if(arr[i] == max) {
				index = i; max = arr[i]; f = true;
			}
		}
		//�ε��� ��ġ�� ���� ���
		char out = f == false ? (char)(index+'A') : '?';
		System.out.println(out);
	}
}
