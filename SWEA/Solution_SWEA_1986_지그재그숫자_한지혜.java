import java.util.Scanner;

/**
 * 
 * 
입력
2
5
6

출력
#1 3
#2 -3
 

 * @author multicampus
 *
 */
public class Solution_SWEA_1986_지그재그숫자_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				if(i%2 == 0) sum += (-1)*i;
				else sum += i;
			}
			
			
			System.out.println("#"+testCase + " " + sum);
		}
	}//end of main
}//end of class
