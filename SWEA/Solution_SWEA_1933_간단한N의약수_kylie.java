import java.util.Scanner;

public class Solution_SWEA_1933_간단한N의약수_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) System.out.print(i+" ");
		}
	}
}
