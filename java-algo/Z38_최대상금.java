import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Greedy 탐욕기법 : 코드간단, 속도가 가장 빠름 가설에 오류가 있다면, 답을 구할 수 없다. -> Backtracking
 */
public class Z38_최대상금 {
	private static int max;
	private static HashSet<String> set;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			int[] num = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {// 입력된 숫자를 정수배열로 만들어줌
				num[i] = s.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken());
			max = 0;
			find(num, N);
			sb.append("#").append(t).append(" ").append(max).append("\n");
		} // end of for tc
		System.out.print(sb);
	}// end of main

	/**
	 * 
	 * @param num : 숫자판 배열
	 * @param N   : 남은 교환횟수, 남은 교환횟수를 이용해서 숫자판 바꿔보며 최대상금 찾기
	 */
	public static void find(int[] num, int N) {
		// 숫자판을 숫자로 만들어보기
		set = new HashSet<String>();
		int val = 0; // 최대상급(숫자값)을 담을 변수
		for (int i = 0; i < num.length; i++) {
			val = val * 10 + num[i];
		}
		if (set.contains("" + val + N)) {//중복체크
			return;
		}else {
			set.add("" + val + N);

		}
		if (N == 0) { // 종료파트
			// 최대값 갱신
			if (max < val) {
				max = val;
			}
		} else { // 재귀파트
			// 임의 자리 2개 선택(조합)후 한번 바꾸기
			for (int i = 0; i < num.length - 1; i++) {
				for (int j = i; j < num.length; j++) {
					// num i 번째 j번째 swap`
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					find(num, N - 1);
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
	}
}// end of class
