import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_1984_중간평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int[] num = new int[10];
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}
			Arrays.sort(num);
			double sum = 0.0;
			for (int i = 1; i < num.length-1; i++) {
				sum += num[i];
			}
			System.out.println("#"+testCase+ " " + Math.round((double)sum/(num.length-2)));
		}
	}//end of main
}//end of class
