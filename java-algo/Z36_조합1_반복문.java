/**
 * �κ�����(Subset) : ���տ� ���Ե� ���ҵ��� �����ϴ� �� -> �ݺ��� : �ݺ��� ��� ���̳ʸ� ī���� ��� -> ���̳ʸ�ī���� :
 * 0������ 2^n - 1���� -> Backtracking ��� :
 * 
 * ����(Combination) : ���� �ٸ� n���� ������ r���� �������� ��� �� -> ��� : -> ��ȭ�� : ��ͺ��� ����� ����
 * ������.
 */
public class Z36_����1_�ݺ��� {
	public static void main(String[] args) {
		// 5C3
		// {0,1,2,3,4}
		int[] arr = {2,5,7,6,9};
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " ");
				}
			}
		}
	}// end of main
}// end of class
