import java.util.Arrays;
import java.util.Scanner;

public class boj_1981_�˹�_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int gcm = arr[1] - arr[0];
		Arrays.sort(arr);
		for (int i = 2; i < arr.length; i++) {
			gcm = factor(gcm, arr[i]-arr[i-1]);
		}
		for (int i = 2; i <= gcm; i++) {
			if(gcm%i == 0)System.out.print(i + " ");
		}
		
	}
	private static int factor(int a, int b) {
		if (b == 0) return a;
		return factor(b, a%b);
	}
}
