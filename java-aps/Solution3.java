import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 정렬 - 우선순위 
 * 중복을 제거
 * =>제한시간 초과
 * 선택정렬 O[N^2]
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();// 1~50
		for (int t = 1; t <= TC; t++) {
			int N = sc.nextInt();// 이름의 개수 1~20,000

			TreeSet<String> name = new TreeSet<String>(new Comparator<String>() {

				@Override
				public int compare(String pre, String next) {
					if (pre.length() != next.length()) {
						return pre.length() - next.length();
						}else {
							return pre.compareTo(next);
						}
					}
			});
			for (int i = 0; i < N; i++) {
				name.add(sc.next());//중복 자동 제거
			}
//			System.out.println(name);
			// 중복을 제거
			System.out.println("#"+t);
			for (String string : name) {
				System.out.println(string);
			}
		}//end of tc
		sc.close();
	}//end of main
}//end of class
