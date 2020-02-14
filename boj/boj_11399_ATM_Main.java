import java.util.Arrays;
import java.util.Scanner;

public class boj_11399_ATM_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] peopleArr = new int[n];
		for (int i = 0; i < peopleArr.length; i++) {
			peopleArr[i] = sc.nextInt();
		}
		Arrays.sort(peopleArr);
		int minSum = 0;
		int sum = 0;
		for (int i = 0; i < peopleArr.length; i++) {
			sum += peopleArr[i];
			minSum += sum;
		}
		System.out.println(minSum);
	}
}
