import java.util.Scanner;

public class boj_5086_배수와약수_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		while(A != 0 && B != 0) {
			if(A > B && A%B == 0) System.out.println("multiple");
			else if(A < B && B%A == 0) System.out.println("factor");
			else System.out.println("neither");
			A = sc.nextInt();
			B = sc.nextInt();
		}
	}
}
