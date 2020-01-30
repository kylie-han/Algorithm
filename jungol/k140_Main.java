import java.util.Scanner;

public class k140_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < 20; i++) {
			int num = sc.nextInt();
			if(num == 0) break;
			cnt++;
			sum += num;
		}
		System.out.println(sum + " " + sum/cnt);
	}
}
