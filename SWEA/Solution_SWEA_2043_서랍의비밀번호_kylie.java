import java.util.Scanner;

public class Solution_SWEA_2043_�����Ǻ�й�ȣ_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pw = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for (int i = k; i <= pw; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}//end of main
}//end of class
