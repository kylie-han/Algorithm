import java.util.Scanner;

public class Boj_2231_kylie_Main {
	static int N, ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int num = N;
		while(num != 0) {
			num--;
			int sum = partSum(num)+num;
			if(sum == N) {
				ans = num;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	private static int partSum(int num) {
		int sum = 0;
		while(num != 0) {
			sum += num%10;
			num/=10;
		}
		return sum;
	}
}
