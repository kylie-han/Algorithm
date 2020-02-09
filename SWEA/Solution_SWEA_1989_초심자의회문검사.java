
import java.util.Scanner;

public class Solution_SWEA_1989_초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			String str = sc.next();
			boolean flag = true;
			for (int i = 0; i <= str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i)) {
					
					flag = false; 
					break;
				}
			}
			if(flag) System.out.println("#"+ testCase + " "+ 1);
			else System.out.println("#"+ testCase + " "+ 0);
		}
	}//end of main
}//end of class
