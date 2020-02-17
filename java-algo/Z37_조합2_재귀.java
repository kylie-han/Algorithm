import java.util.Arrays;

/**
 * �κ�����(Subset) : ���տ� ���Ե� ���ҵ��� �����ϴ� �� -> �ݺ��� : �ݺ��� ��� ���̳ʸ� ī���� ��� -> ���̳ʸ�ī���� :
 * 0������ 2^n - 1���� -> Backtracking ��� :
 * 
 * ����(Combination) : ���� �ٸ� n���� ������ r���� �������� ��� �� 
 * -> ��� : 
 * -> ��ȭ�� : ��ͺ��� ����� ���� ������.
 */
public class Z37_����2_��� {
	public static int[] arr = {1,3,5,7};
	public static int[] trr;
	public static void main(String[] args) {
		int n = arr.length;
		int r = 3;
		trr = new int[r];
		comb(0, 0);
	}//end of main
	public static void comb(int n, int r) {
		if (r == trr.length) {
			System.out.println(Arrays.toString(trr));
		}else if (n<r || n>=arr.length) {
			return;
		}else {
			trr[r] = arr[n];
			comb(n+1, r+1);
			comb(n+1, r);
		}
	}
}//end of class
//public class Z37_����2_��� {
//	public static int[] arr = {1,3,5,7};
//	public static int[] trr;
//	public static void main(String[] args) {
//		int n = arr.length;
//		int r = 3;
//		trr = new int[r];
//		comb(n, r);
//	}//end of main
//	public static void comb(int n, int r) {
//		if (r == 0) {
//			System.out.println(Arrays.toString(trr));
//		}else if (n<r) {
//			return;
//		}else {
//			trr[r-1] = arr[n-1];
//			comb(n-1, r-1);
//			comb(n-1, r);
//		}
//	}
//}//end of class
