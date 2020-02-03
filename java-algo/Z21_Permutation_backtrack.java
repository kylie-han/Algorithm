
/**
 * 
 * 순열
 * 
 * @author multicampus
 *
 */
public class Z21_Permutation_backtrack {
	public static int[] arr = {3,6,7};// 순열을 뽑고자 하는 집합.
	public static void main(String[] args) {
		// arr의 순열을 구해보자
		int[] a = new int[arr.length];//	순번을 저장할 배열, 0번 인덱스도 사용 // 바이너리카운팅처럼 사용하면 1이고 아니면 0
		backtrack(a, 0, a.length);// 부분집합을 만들고 출력하는 메서드
	}//end of main
	
	
//	[]a : 순번을 저장할 배열,, k : 현재단계, input : 단계의 끝(k == input)이 될 때까지 진행
	public static void backtrack(int[] a,int k,int input) {
		if (k == input) {// 종료파트(해인가?) ->현재단계가 마지막단계이면 출력하는 메서드를 호출한다.
		process_solution(a,k);	//출력하는 메서드
		} else {//재귀파트
			int[] c = new int[a.length];//(사용하지 않은 숫자)후보군을 담을 배열 
			int ncands = make_candidates(a, k, input, c);//후보군의 개수
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k+1, input);
			}//후보군의 개수만큼 반복, 배열의 원소를 넣고 재귀호출

		}
	}
	
//	후보군 배열을 셋팅 후, 후보군 개수의 값을 리턴
	public static int make_candidates(int[] a, int k, int input, int[] c) {
		//k단계 이전에 사용한 숫자를 제외한 숫자만 후보군으로 만들기
		//플래그 변수로 (k단계)지금까지 사용한 숫자를 체크
		boolean[] in_perm = new boolean[arr.length];
		for (int i = 0; i < k; i++) {	//현 단계전까지 사용한 숫자를 체크
			in_perm[a[i]] = true;
		}
		
		//플래그 변수를 보고 사용하지 않은 숫자만 후보군으로 저장
		int ncands = 0; // 후보군의 개수 리턴할 값
		for (int i = 0; i < in_perm.length; i++) {
			if (!in_perm[i]) {
				c[ncands] = i;
				ncands++;
			}
		}
		return ncands;// 후보군의 개수
	}

//	순열을 촐력
	public static void process_solution(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(arr[a[i]]+" ");//원소 출력하기
//			System.out.print(a[i]+" ");//순번 출력하기
		}System.out.println();
	}
}//end of class
