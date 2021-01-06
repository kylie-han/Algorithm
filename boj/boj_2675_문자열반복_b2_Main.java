import java.util.Scanner;

public class boj_2675_문자열반복_b2_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int times = sc.nextInt();
			String str = sc.next();
			String out = "";
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < times; j2++) {
					out = out+ str.charAt(j);
				}
			}
			System.out.println(out);
		}
	}
}
