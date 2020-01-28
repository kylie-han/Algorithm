import java.util.Scanner;

public class 정올_Main_1169_주사위던지기1_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dice = {1,2,3,4,5,6};
		int[] a = new int[n];
		switch (m) {
		case 1:
			all(n);
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
		
	}
	public static void all(int num) {
		for (int i = 1; i <= num; i++) {
			if (num <= 0) {
				break;
			} else {
				System.out.print(i);
				all(num-1);
			} 
			System.out.println();
		}
	}
}
