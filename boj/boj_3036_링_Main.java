import java.util.Scanner;

public class boj_3036_¸µ_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < arr.length; i++) {
			int gcm = factor(arr[0],arr[i]);
			System.out.println(arr[0]/gcm + "/" + arr[i]/gcm);
		}
	}
	private static int factor(int a, int b) {
		if (b == 0) return a;
		return factor(b, a%b);
	}
}
