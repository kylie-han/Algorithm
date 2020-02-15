import java.util.Scanner;

public class Solution_SWEA_2019_더블더블_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inData = sc.nextInt();
		int o = 1;
		for (int i = 0; i <= inData; i++) {
			System.out.print(o+" ");
			o *= 2;
		}
	}
}
