import java.util.Scanner;

public class boj_1629_°ö¼À_Main {
	static int A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		System.out.println((int)multiple(B));
	}

	private static long multiple(int b) {
		if(b == 1) {
			return A%C;
		}
		long a = (multiple(b / 2) % C);
		if (b % 2 == 0) {
			return (a * a) % C;
		} else {
			return ((a * a) % C * multiple(1)) % C;
		}
	}
}
