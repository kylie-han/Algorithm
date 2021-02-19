import java.util.Arrays;
import java.util.Scanner;

public class Boj_1427_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int cnt = N.length();
		int[] arr = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(N.charAt(i)+"");
		}
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
