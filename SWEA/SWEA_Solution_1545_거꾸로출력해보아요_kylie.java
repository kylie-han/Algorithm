import java.util.Scanner;

public class SWEA_Solution_1545_거꾸로출력해보아요_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inData = sc.nextInt();
		for (int i = inData; i >= 0 ; i--) {
			System.out.print(i+" ");
		}
	}
}
