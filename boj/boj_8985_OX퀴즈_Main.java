import java.util.Scanner;

public class boj_8985_OX����_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int testcase = 0; testcase < tc; testcase++) {
			String str = sc.next();
			int cnt = 1;
			int score = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					score += cnt++;
				} else
					cnt = 1;
			}
			System.out.println(score);
			sc.close();
		}
	}//end of main
}//end of class
