import java.util.Scanner;

public class Solution_SWEA_1213_String_kylie {
	static int T = 10;
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < T; i++) {
			int t = sc.nextInt();
			String part = sc.next();
			String all = sc.next();
			ans = 0;
			// all�� ��� ���ڿ� ���ؼ�
			for(int j = 0; j < all.length(); j++) {
				// part�� ���۰� ���� ������ ������ Ȯ���غ���
				if(all.charAt(j) == part.charAt(0)) {
					int cnt = 1;
					for(int k = 1; k < part.length(); k++) {
						if(j+k >= all.length() || all.charAt(j+k) != part.charAt(k)) {
							break;
						}
						else {
							cnt++;
						}
					}
					if(cnt >= part.length()) ans++;
				}
			}
			
			System.out.println("#"+ t+ " "+ ans);
		}//tc
	}//main
}
