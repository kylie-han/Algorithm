import java.util.Scanner;

public class boj_11047_Main {
	static int N,price,cnt;
	static int[] coins;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		price = sc.nextInt();
		coins = new int[N];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		cnt = 0;
		int idx = N-1;
		while(price != 0) {
			cnt += price / coins[idx];
			price = price % coins[idx]; 
			idx--;
		}
		System.out.println(cnt);
		sc.close();
	}
}
