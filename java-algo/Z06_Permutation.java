
public class Z06_Permutation {
	public static void main(String[] args) {
		int[] arr = {3,7,9,};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) continue;
				for (int k = 0; k < 3; k++) {
					if (j == k || i == k) continue;
//					System.out.println(i+","+j+","+k);	//int�� ������ �ڷ���(byte,short,char,int)�� ���׿���� int������ �ڵ� ��ȯ�ȴ�.
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
	}
}
