/**
 * 
 * LIS ���� ���� ���� 
 * O[NlogN]
 * 	8 ������ 2�� �� ��� �׳� ������ �ʰ� LIS�� ������ �� �ִ� ��ġ�� �����صд�
 * 
 *
 */
public class LIS_2 {
	public static void main(String[] args) {
		int[] a = {8,2,4,3,6,11,7,10,14,5};
		int[] c = new int[a.length];// LIS�� ��� ������ ���ڸ� ����
		int size = 0;//LIS ���� ������ ����
		c[size++] = a[0];// ù��° ���ڴ� �ٷ� �ݿ�
		for (int i = 0; i < a.length; i++) {
			// c�迭�� ������ ���ڿ� �������� ��
			if (c[size-1] < a[i]) {
				c[size++] = a[i];// �� �ڿ� ����
			}else { //LIS ������ ���ں��� ũ�� ������ LIS�� ���� ������Ʈ(����Ž��)
				
				
			}
		}
		System.out.println("LIS�� ���� : " + size);
	}//end of main
}//end of class
