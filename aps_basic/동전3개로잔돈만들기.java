import java.util.Arrays;
import java.util.Scanner;

/**
 * 그리디는 되돌릴 수 없어 가장 빠를 수 있지만 답이 나오지 않을 수 있음
 * 
 * 
 * 8원 잔돈에 대한 알고리즘
 * 3가지 동전 각각을 선택해서 재귀적으로 해결
 * 1. 1원 동전 한개 +7원동전에 대한 최적해
 * 2. 4원 동전 한개 +4원동전에 대한 최적해
 * 3. 6원 동전 한개 +2원동전에 대한 최적해
 * =>call tree 그려보기
 * 
 * 1차원 배열에 업데이트 해서 동전 거스름돈 개수를 저장해보자
 */
public class 동전3개로잔돈만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// input
		
		int[] C = new int[N+1];
		
		for (int i = 0; i < C.length; i++) {
			C[i] = i;	// 1원짜리 필요한 개수 
			
		}
		System.out.println(Arrays.toString(C));
		// 1, 4원짜리를 모두 고려
		for (int i = 4; i < C.length; i++) {
			// C[i] : 현재 1원짜리 동전만 고려한 최소개수
			// C[i-4]+1 : 1, 4원짜리 고려한 최소개수
			if (C[i] > C[i-4]+1 ) { 
				C[i] = C[i-4]+1; 
			}
		}
		System.out.println(Arrays.toString(C));
		// 1, 4, 6원짜리를 모두 고려
		for (int i = 6; i < C.length; i++) {
			// C[i] : 현재 1, 4원짜리 동전만 고려한 최소개수
			// C[i-6]+1 : 1, 4, 6원짜리 고려한 최소개수
			if (C[i] > C[i-6]+1 ) { 
				C[i] = C[i-6]+1; 
			}
		}
		System.out.println(Arrays.toString(C));
		sc.close();
	}
}
