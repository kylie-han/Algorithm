import java.util.Scanner;

public class Main_549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inData = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 0; sum < inData; i++) {
			if(i%2 == 1) {
				sum+=i;
				cnt++;
			}
		}
		System.out.print(cnt+" "+sum);
	}
}
/*
 * 100
 * 10 100
 */
//public class Main_549 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int num = 0;
//		int sum = 0;
//		for (int i = 1; sum < n; i=i+2) {
//			sum+=i;
//			num++;
//		}
//		System.out.print(num+" "+sum);
//		
//	}
//}
