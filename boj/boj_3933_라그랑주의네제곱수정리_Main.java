import java.util.Scanner;

public class boj_3933_라그랑주의네제곱수정리_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			double m = Math.sqrt(n);
			
			System.out.println(m +"//"+ (int)m);
			
			
			
		}
		
	}//end of main
}//end of class
