
import java.util.Scanner;

public class SWEA_Solution_2068_최대수구하기_kylie{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int[] a = new int[10];
			int max = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if (a[i] >= max) max = a[i];
			}
			System.out.println("#"+testCase+" "+max);
		}//for_testCase
	}//main
}//class