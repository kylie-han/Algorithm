import java.util.Scanner;

public class Solution_SWEA_1204_�ֺ�����ϱ�_D2_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();//�Էµ� �׽�Ʈ���̽� ����
		for (int testCase = 1; testCase <= TC; testCase++) {//�׽�Ʈ ������ŭ �ݺ�
			int testNum = 0;//�׽�Ʈ���̽� ��ȣ
			testNum = sc.nextInt();//�׽�Ʈ ���̽� �ѹ�
			int[] arr = new int[101];//������ ����
			for (int i = 0; i < 1000; i++) {//1000���� �л���
				int num = sc.nextInt();
				arr[num]++;	//�л����� ������ �迭�� �ϴ��� �������� ���� üũ
			}
			int mode = 0;	//�ֺ���� Ƚ��
			int modeNum = 0;//�ֺ��
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>=mode) {
					mode = arr[i];
					modeNum = i;
				}
			}
			System.out.println("#"+testNum+" "+modeNum);
		}
	}
}
