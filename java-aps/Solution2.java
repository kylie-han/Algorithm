import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * ���� - �켱���� 
 * �ߺ��� ����
 * 
 * �������� O[N^2]=>���ѽð� �ʰ�
 * API ����
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();// 1~50
		for (int t = 1; t <= TC; t++) {
			int N = sc.nextInt();// �̸��� ���� 1~20,000

			String[] name = new String[N];
			for (int i = 0; i < N; i++) {
				name[i] = sc.next();
			}
			Arrays.sort(name, new Comparator<String>() {

				@Override
				public int compare(String pre, String next) {
					if (pre.length() != next.length()) {
						return pre.length() - next.length();
						}else {
							return pre.compareTo(next);
						}
					}
			});

//			System.out.println(Arrays.toString(name));
			// �ߺ��� ����
			System.out.println("#"+t);
			
			String temp = null;
			for (int i = 0; i < name.length; i++) {
				if (!name[i].equals(temp)) {
					System.out.println(name[i]);
				}
				temp = name[i];
			}
		}
		sc.close();
	}
}
