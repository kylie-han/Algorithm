import java.util.Arrays;
import java.util.Scanner;

public class Boj_1037_Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		ans = arr[0] * arr[arr.length-1];
		System.out.println(ans);
		sc.close();
	}
}
