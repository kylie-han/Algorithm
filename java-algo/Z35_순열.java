/**
 * ����(Permutation) : ���� �ٸ� �͵��� ��� �̾Ƽ� ���ٷ� ����(����, �ߺ�����..)
 * N�� 12�ϰ������� integer ����, 10�� �Ѿ�� �д����� ���� ��
 * -> �ݺ��� : n�� ������ ���� ��� ���� ���� ��� -����ġ�Ⱑ �����
 * -> backtracking ��� : �� ������� ����
 * -> swap ���** : �ڵ尡 ª�� ����
 * 		�ּ� ������ ���� ��� : ���� ���¿��� �ΰ����� ��ȯ���� ��Ÿ��
 * 		
 * @author multicampus
 *
 */
public class Z35_���� {
	public static int[] arr = {6, 7, 8};
	public static void main(String[] args) {
		int n = arr.length;
		int r = 3;
		perm(r, 0);
	}//end of main
	/** r : ���� ����, k : ���� �ܰ�*/
	public static void perm(int r, int k) {
		if (r == k) {//����
			for (int i = 0; i <  r; i++) {
				System.out.print(arr[i] +" ");
			}System.out.println();
		} else {//���
			for (int i = k; i < arr.length; i++) {
				// i��° , k��° swap
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				//���ȣ��
				perm(r, k+1);
				// i��° , k��° swap(����
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
}//end of class
