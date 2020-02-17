import java.util.Arrays;

/**
 * 부분집합(Subset) : 집합에 포함된 원소들을 선택하는 것 -> 반복문 : 반복문 대신 바이너리 카운팅 사용 -> 바이너리카운팅 :
 * 0번부터 2^n - 1까지 -> Backtracking 재귀 :
 * 
 * 조합(Combination) : 서로 다른 n개의 원소중 r개를 순서없이 골라낸 것 
 * -> 재귀 : 
 * -> 점화식 : 재귀보다 계산이 적어 빠르다.
 */
public class Z37_조합2_재귀 {
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
//public class Z37_조합2_재귀 {
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
