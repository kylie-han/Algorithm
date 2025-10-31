import java.util.Arrays;
import java.util.Scanner;

/**
 * N개의 자연수 중에서 M개를 고른 수열
 * 비내림 차순
input
4 2
9 7 9 1
output
1 7
1 9
7 9
9 9
 */
public class daily_0130 {
	static String ans = "";
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		perm(0,0,M);
		sc.close();
	}
	private static void perm(int i, int p, int m) {
		if(i >= m) {
			System.out.println(ans);
		}
		else {
			for (int j = p; j < arr.length; j++) {
				if(j>0 && arr[j] == arr[j-1])continue;
				ans+= arr[j]+" ";
				perm(i+1, j+1, m);
				ans = ans.substring(0,ans.length()-2);
			}
		}
	}
}
