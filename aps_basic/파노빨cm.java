import java.util.Scanner;

public class �ĳ뻡cm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] memo = new int[N+1];
		
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		for (int i = 4; i <= N; i++) {
			memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
		}
		System.out.println(memo[N]);
		
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		memo[4] = 7;
		for (int i = 5; i <= N; i++) {
			memo[i] = memo[i-1]*2 - memo[i-4];
		}
		System.out.println(memo[N]);
	}// end of main
}//end of class
