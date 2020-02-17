/**
 * 부분집합(Subset) : 집합에 포함된 원소들을 선택하는 것 -> 반복문 : 반복문 대신 바이너리 카운팅 사용 -> 바이너리카운팅 :
 * 0번부터 2^n - 1까지 -> Backtracking 재귀 :
 * 
 * 조합(Combination) : 서로 다른 n개의 원소중 r개를 순서없이 골라낸 것 -> 재귀 : -> 점화식 : 재귀보다 계산이 적어
 * 빠르다.
 */
public class Z36_조합1_반복문 {
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
