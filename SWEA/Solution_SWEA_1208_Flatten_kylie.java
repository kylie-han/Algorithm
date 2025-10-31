import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_1208_Flatten_kylie {
	static int[] array = new int[100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			int times = sc.nextInt();
			for (int j = 0; j < array.length; j++) {
				array[j] = sc.nextInt();
			}
			for (int j = 0; j < times; j++) {
				Arrays.sort(array);
				array[0]++;array[99]--;
			}
			Arrays.sort(array);
			System.out.println("#"+i + " "+ (array[99]-array[0]));
		}
		sc.close();
	}
}
