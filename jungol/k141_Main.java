import java.util.Scanner;

public class k141_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= 100; i++) {
			int outData = num * i;
			if(outData>=100) break;
			System.out.print(outData + " ");
			if(outData%10 == 0) break;
		}
		sc.close();
	}
}
