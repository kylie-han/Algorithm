import java.util.Scanner;

public class SWEA_2070_Å«³ğ°°Àº³ğÀÛÀº³ğ_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == b) System.out.println("#"+testCase+" =");
			else System.out.println(a>b ? "#"+testCase+" >" : "#"+testCase+" <");
		}//for_testCase
	}//main
}//class
