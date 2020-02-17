/**
 * 순열(Permutation) : 서로 다른 것들중 몇개를 뽑아서 한줄로 나열(순열, 중복순열..)
 * N이 12일경우까지만 integer 가능, 10이 넘어가면 분단위로 계산될 것
 * -> 반복문 : n이 정해져 있을 경우 제일 빠른 방법 -가지치기가 어려움
 * -> backtracking 재귀 : 잘 사용하지 않음
 * -> swap 재귀** : 코드가 짧고 간단
 * 		최소 변경을 통한 방법 : 이전 상태에서 두가지의 교환으로 나타냄
 * 		
 * @author multicampus
 *
 */
public class Z35_순열 {
	public static int[] arr = {6, 7, 8};
	public static void main(String[] args) {
		int n = arr.length;
		int r = 3;
		perm(r, 0);
	}//end of main
	/** r : 뽑을 개수, k : 현재 단계*/
	public static void perm(int r, int k) {
		if (r == k) {//종료
			for (int i = 0; i <  r; i++) {
				System.out.print(arr[i] +" ");
			}System.out.println();
		} else {//재귀
			for (int i = k; i < arr.length; i++) {
				// i번째 , k번째 swap
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				//재귀호출
				perm(r, k+1);
				// i번째 , k번째 swap(원복
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
}//end of class
