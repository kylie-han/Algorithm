import java.util.Scanner;

public class Boj_1676_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		while(N>0) {
			int temp = N--;
			while(temp%5 ==0) {
				temp /= 5;
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
