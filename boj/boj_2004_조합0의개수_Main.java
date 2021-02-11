import java.util.Scanner;

public class boj_2004_조합0의개수_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long five = 1;
		long ansf = 0;
		long two = 1;
		long anst = 0;
		while(true) {
			five *= 5;
			two *= 2;
			ansf += N/five - (N-M)/five - M/five;
			anst += N/two - (N-M)/two - M/two;
			if(two>N) {
				break;
			}
		}
		System.out.println(Math.min(ansf, anst));
	}
}
