import java.util.Scanner;

public class Solution_SWEA_2029_몫과나머지출력하기_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int a = sc.nextInt();
			int b = sc.nextInt();			
			System.out.printf("#%d %d %d\n",testCase, a/b, a%b);
		}
	}//end of main
}//end of class