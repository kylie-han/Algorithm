import java.util.Arrays;

public class Z16_Exam {
	public static void main(String[] args) {
		//swap
		//�迭�� ������
		//�ִ밪, �ʱⰪ : min_value, �� ���󿡼� ���� ��, ���� �� �� ���� ���� ��
		//��������
		int[] arr = {2,4,6,8,1,3,5,7,};
		int key = 1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				flag = true;
				break;//�극��ũ�� ������ ����Ž��, �극��ũ ������ ��Ʈ��ŷ
			}
		}
		if(flag) System.out.println("�ִ�.");
		else System.out.println("����.");
////////////////////////////////////////////////////		
//		int[] arr = {2,4,6,8,1,3,5,7,};
//		int key = 1;
//		for (int i = 0; i < arr.length; i++) {
//			if(key == arr[i]) {
//				System.out.println("�ִ�.");
//				break;
//			}
//			if(i == arr.length-1) {//������������ ������ ���� ���
//				System.out.println("����.");
//			}
//////////////////////////////////////////////////////
		int[] brr = {3,3,2,1,1,4,1,4};
		key = 1;
		int count = 0;
		for (int i = 0; i < brr.length; i++) {
			if (key == brr[i]) {
				count++;
			}
		}
		System.out.println(count + "��");
//////////////////////////////////////////////////////
		int[] crr = {3,3,2,1,1,4,1,4};
		int[] cnt = new int[5];
//		int cnt1 = 0;
//		int cnt2 = 0;
//		int cnt3 = 0;
//		int cnt4 = 0;
		for (int i = 0; i < crr.length; i++) {
			cnt[crr[i]]++;
//			if(crr[i] == 1) {
//				cnt[1]++;
//			}
//			if(crr[i] == 2) {
//				cnt[2]++;
//			}
//			if(crr[i] == 3) {
//				cnt[3]++;
//			}
//			if(crr[i] == 4) {
//				cnt[4]++;
//			}
		} System.out.println(Arrays.toString(cnt));
		
	}
}
