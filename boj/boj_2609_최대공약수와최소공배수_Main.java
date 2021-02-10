import java.util.Scanner;

public class boj_2609_최대공약수와최소공배수_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = factor(A,B);
		System.out.println(ans);
		System.out.println(A*B/ans);
		
	}

	private static int factor(int a, int b) {
		if (b == 0) return a;
		return factor(b, a%b);
	}
}
