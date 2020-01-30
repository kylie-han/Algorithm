import java.util.Scanner;

public class k553_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char en = 'A';
		for (int i = n; i> 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(en);
				en++;
			}
			System.out.println();
		}	
		
	}//end of main
}//end of class