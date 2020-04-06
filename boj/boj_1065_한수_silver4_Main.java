import java.util.Scanner;

public class boj_1065_�Ѽ�_silver4_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int cnt = 0;
		// 0~99�� ��� �Ѽ��̴�. �Է°��� 99���� ���� ��� �״�� ����ص� �ȴ�.
		if (N < 100) result = N;
		// �Է°��� 99���� ū��� 100~N������ �Ѽ��� ������ ���ؼ� 99�� ���� ����Ѵ�.
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
	 * ���� n �� �Ѽ��̸� cnt�� ������Ű�� �޼���
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
