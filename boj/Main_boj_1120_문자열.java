import java.util.Scanner;

public class Main_boj_1120_¹®ÀÚ¿­ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String strB = sc.next();
		int bcrt = 0;
		int ans = 0;
		for (int i = 0; i <= strB.length() - strA.length(); i++) {
			int crt = 0;
			for (int j = 0; j < strA.length(); j++) {
				if (strB.charAt(i+j) == strA.charAt(j)) {
					crt++;
				}
			}
			if (crt >= bcrt) {
				bcrt = crt;
				ans = i;
			}
		}
//		System.out.println(bcrt);
//		System.out.println(ans);
//		for (int i = 0; i < ans; i++) {
//			strA = strB.charAt(i)+strA;
//		}
//		for (int i = ans+strA.length()-1; i < strB.length(); i++) {
//			strA = strA+strB.charAt(i);
//		}
		System.out.println(strA.length()-bcrt);
	}
}
