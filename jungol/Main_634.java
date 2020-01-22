import java.util.Scanner;

//public class Main_634 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int inData = sc.nextInt();
//		for (int i = 0; i < inData; i++) {//yรเ
//			for (int j = inData; j > 0 ; j--) {//xรเ
//				if(i==j)break;
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
/*
5
*****
****
***
**
*
 */
public class Main_634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inData = sc.nextInt();
		for (int i = 0; i < inData; i++) {
			for (int j = 0; j < inData; j++) {
				System.out.print("*");
				if(i==j)break;
			}
			System.out.println();
		}
	}
}
/*
5
*
**
***
****
*****
 */
