/**
 * 모든 부분집합을 원소로 하는 집합
 * 	1. 반복문
 * 	2. 바이너리 카운팅
 * 	3. 재귀호출 - 원하는 조건을 추가할 수 있음
 * 
 * @author multicampus
 *
 */
public class Z20_Powerset_backtrack {
	public static int[] arr = {3,6,7};// 부분집합을 뽑고자 하는 집합.
	public static void main(String[] args) {
		// arr의 모든 부분집합을 구해보자
		boolean[] a = new boolean[arr.length];//	부분집합의 원소를 사용할지 여부를 저장할 배열, 0번 인덱스도 사용 // 바이너리카운팅처럼 사용하면 1이고 아니면 0
		backtrack(a, 0, a.length);// 부분집합을 만들고 출력하는 메서드
	}//end of main
	
	
//	[]a : 배열원소의 사용유무를 저장할 배열,, k : 현재단계, input : 단계의 끝(k == input)이 될 때까지 진행
	public static void backtrack(boolean[] a,int k,int input) {
		if (k == input) {// 종료파트(해인가?) ->현재단계가 마지막단계이면 출력하는 메서드를 호출한다.
		process_solution(a,k);	//출력하는 메서드
		} else {//재귀파트
			boolean[] c = new boolean[2];//후보군을 담을 배열 true, false
			int ncands = make_candidates(a, k, input, c);//후보군의 개수
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k+1, input);
			}//후보군의 개수만큼 반복, 배열의 원소를 넣고 재귀호출

		}
	}
	
//	후보군 배열을 셋팅 후, 후보군 개수의 값을 리턴
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		// TODO Auto-generated method stub
		c[0] = true;
		c[1] = false;
		return 2;
	}

//	배열의 원소의 사용여부를 보고 촐력
	public static void process_solution(boolean[] a, int k) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(a[i]) {
				System.out.print(arr[i]+" ");//원소 출력하기
			}
		}System.out.println();
	}
}//end of class
