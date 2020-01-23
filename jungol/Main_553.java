import java.util.Scanner;

public class Main_553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num_o = 1;
		char ch_o = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 0; j--) {
				if(i < j) {
					System.out.printf("%2d ",num_o);
					num_o++;
				}else {
					System.out.printf("%2s ",ch_o);
					ch_o += 1;
				}
			}
			System.out.println();
		}
	}
}
//3
//1 2 3 A 
//4 5 B C 
//6 D E F 

//º°Âï±â
//public class Main_553 {
//	public static void main(String[] args) {
//		for(int y=0; y<5;y++) {
//			for (int x = 5; x > 0; x--) {
//				if(y==x) break;
//				System.out.print("*");
//			}
//			for (int x = 0; x < 5; x++) {
//				System.out.print(".");
//				if(y==x) break;
//			}
//			System.out.println();
//		}
//	}
//}
//*****.
//****..
//***...
//**....
//*.....