import java.util.Arrays;
import java.util.Scanner;

public class Solution_4050_서울_12반_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[] c = new int[n];
			
			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			
			Arrays.sort(c);
			
			int cnt = 1;
			int sum = 0;
			for (int i = n-1; i >= 0; i--,cnt++) {
				if(cnt%3==0) continue;
				sum += c[i];
			}
			
			System.out.println("#"+t+" "+sum);
		}
	}
}
