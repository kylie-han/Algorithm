import java.util.Arrays;
import java.util.Scanner;

/**
 * 정렬 - 우선순위 
 * 중복을 제거
 * =>제한시간 초과
 * 선택정렬 O[N^2]
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();// 1~50
		for (int t = 1; t <= TC; t++) {
			int N = sc.nextInt();// 이름의 개수 1~20,000

			String[] name = new String[N];
			for (int i = 0; i < N; i++) {
				name[i] = sc.next();
			}
//			// 선택정렬 - 우선순위
//			// 0~끝 name[0] <-> name[minIndex]
//			// 1~끝 name[1] <-> name[minIndex]
//			// 2~끝 name[2] <-> name[minIndex]
//
//			// 끝-1~끝 name[끝-1] <-> name[minIndex]
			for (int i = 0; i < name.length; i++) {
				int minIndex = i; //최소값의 방번호
				for (int j = i; j < name.length; j++) { //범위 i~끝
					if ( compare(name[minIndex],name[j]) > 0) {// 최소값이라면, 앞쪽에 배치해야한다면
						minIndex = j;// 최소값 인덱스 기억
					}
				}
				// name[i] <-> name[minIndex]
				String temp = name[i];
				name[i] = name[minIndex];
				name[minIndex] = temp;
			}
//			System.out.println(Arrays.toString(name));
			// 중복을 제거
			Arrays.sort(name);
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
	/**
	 * 
	 * @param pre
	 * @param next
	 * @return 두 수를 바꿔야 한다면 양수
	 */
	private static int compare(String pre, String next) {
		if (pre.length() != next.length()) {
		return pre.length() - next.length();
		}else {
			return pre.compareTo(next);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
