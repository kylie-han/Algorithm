import java.util.Scanner;

public class boj_1065_한수_silver4_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int cnt = 0;
		// 0~99는 모두 한수이다. 입력값이 99보다 작은 경우 그대로 출력해도 된다.
		if (N < 100) result = N;
		// 입력값이 99보다 큰경우 100~N사이의 한수의 개수만 구해서 99를 더해 출력한다.
		else {
			for (int i = 100; i <= N; i++) {
				if (ishanNum(i))cnt++;
			}
			
			result = 99 + cnt;
		}
		System.out.println(result);
		sc.close();
	}
	/**
	 * 숫자 n 이 한수이면 cnt를 증가시키는 메서드
	 * @param n : 100~999
	 */
	private static boolean ishanNum(int n) {
		int[] arr = new int[4];
		//n = 100 -> 
		for (int i = 3; i >= 0; i--) {
			arr[i] = n%10;
			n /=10;
		}
		// i = 321 -> arr = {3,2,1}
//		System.out.println(Arrays.toString(arr));
		if ( arr[0] == 0 && arr[1] - arr[2] == arr[2] - arr[3]) {
			return true;
		}else {
			return false;
		}
	}
}
