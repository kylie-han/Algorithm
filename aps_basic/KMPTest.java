
public class KMPTest {
	// 모든 경우를 다 비교하지 않아도 부분 문자열을 찾을 수 있는 알고리즘.
	
	
	// 파이테이블 : 각 길이별로 접두사 == 접미사의 최대길이가 저장된 배열
	static int[] getPi(String pattern) {
		int []pi = new int[pattern.length()];
		int j = 0;
		for (int i = 1; i < pattern.length(); i++) {
			// 맞는 경우
			if(pattern.charAt(i) == pattern.charAt(j)) {
				// i길이 문자열의 공통길이는 j의 위치 +1
				pi[i] = ++j;
			}
			// 안맞는 경우
			else {
				// 맞는 날이 올 때까지 하나 전 칸에서의 공통부분 위치로 이동
				while(j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
					j = pi[j-1];
				}
			}
		}
		return pi;
	}
	static void KMP(String origin, String pattern) {
		int[] pi = getPi(pattern);
		int j = 0;
		for (int i = 0; i < origin.length(); i++) {
			while(j >0 && origin.charAt(i) != pattern.charAt(j)){
				j = pi[j-1];
			}
			// 맞는 경우
			if (origin.charAt(i) == pattern.charAt(j)) {
				if (j == pattern.length() -1) {
					System.out.println("ㅇㅋ" + (i - pattern.length() +1));
					j = pi[j];
				}
				else
					j++;
			}
		}
	}
	public static void main(String[] args) {
		String origin = "HELLOSSAFY";
		String pattern = "LOSS";
		KMP(origin, pattern);
	}
}
