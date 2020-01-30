import java.util.Scanner;

public class SWEA_Solution_2071_평균값구하기_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {//testCase만큼 반복
			int sum = 0;
			int[] a = new int [10];
			for (int i = 0; i < 10; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
		System.out.println("#"+testCase+" "+Math.round((float)sum/10));	
		}//testCase
	}//end of main
}//end of class
