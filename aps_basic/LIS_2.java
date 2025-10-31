/**
 * 
 * LIS 최장 증가 수열 
 * O[NlogN]
 * 	8 다음에 2가 올 경우 그냥 버리지 않고 LIS를 구성할 수 있는 위치에 저장해둔다
 * 
 *
 */
public class LIS_2 {
	public static void main(String[] args) {
		int[] a = {8,2,4,3,6,11,7,10,14,5};
		int[] c = new int[a.length];// LIS로 사용 가능한 숫자를 저장
		int size = 0;//LIS 개수 관리할 변수
		c[size++] = a[0];// 첫번째 숫자는 바로 반영
		for (int i = 0; i < a.length; i++) {
			// c배열의 마지막 숫자와 수열값을 비교
			if (c[size-1] < a[i]) {
				c[size++] = a[i];// 맨 뒤에 붙임
			}else { //LIS 마지막 숫자보다 크지 않으면 LIS의 값을 업데이트(이진탐색)
				
				
			}
		}
		System.out.println("LIS의 개수 : " + size);
	}//end of main
}//end of class
