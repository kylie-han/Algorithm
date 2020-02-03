/**
 *  모든 부분집합을 원소로 하는 집합
 * 	1. 반복문
 * 	2. 바이너리 카운팅
 * 	3. 재귀호출 - 원하는 조건을 추가할 수 있음
 * 
 * @author multicampus
 *
 */


public class Z22_연습문제2_부분집합의합 {
	public static int[] arr = {1,2,3,4,5,6,7,8,9,10};// 부분집합을 뽑고자 하는 집합.
	public static void main(String[] args) {
		//시간 체크하는 방법
		long startTime = System.currentTimeMillis();	// 1970년 1월 1일 0시 0분 0초 000ms 

		// arr의 모든 부분집합을 구해보자
		boolean[] a = new boolean[arr.length];//	부분집합의 원소를 사용할지 여부를 저장할 배열, 0번 인덱스도 사용 // 바이너리카운팅처럼 사용하면 1이고 아니면 0
		backtrack(a, 0, a.length,0);// 부분집합을 만들고 출력하는 메서드
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime + "ms");
	}//end of main
	
	
//	[]a : 배열원소의 사용유무를 저장할 배열,, k : 현재단계, input : 단계의 끝(k == input)이 될 때까지 진행
//			sum : 현 단계까지 부분집합의 합
	public static void backtrack(boolean[] a,int k,int input, int sum) {
		if (k == input) {// 종료파트(해인가?) ->현재단계가 마지막단계이면 출력하는 메서드를 호출한다.
			if (sum == 10) {
				process_solution(a, k); //출력하는 메서드
			}
		} else {//재귀파트
			boolean[] c = new boolean[2];//후보군을 담을 배열 true, false
			int ncands = make_candidates(a, k, input, c);//후보군의 개수
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				int nextSum = sum + (a[k] ? arr[k] :0);
//				0~k까지의 원소의 합이 10 넘어가면 답이 아니므로 continue;
				if(nextSum>10) continue;
				backtrack(a, k+1, input,nextSum);
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
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				System.out.print(arr[i]+" ");//원소 출력하기
			}
		} System.out.println();
	}
}//end of class
