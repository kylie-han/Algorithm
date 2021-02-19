import java.util.Scanner;

public class Boj_1120_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String strB = sc.next();
		int bcrt = 0;
		for (int i = 0; i <= strB.length() - strA.length(); i++) {
			int crt = 0;
			for (int j = 0; j < strA.length(); j++) {
				if (strB.charAt(i+j) == strA.charAt(j)) {
					crt++;
				}
			}
			if (crt >= bcrt) {
				bcrt = crt;
			}
		}
		System.out.println(strA.length()-bcrt);
		sc.close();
	}
}
