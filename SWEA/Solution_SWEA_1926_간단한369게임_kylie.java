/**

3 6 9 ������ ���α׷����� �������̴�. ���� ��Ģ�� ������ ����.

 

1. ���� 1���� ������� ���ʴ�� ���ϵ�, ��3�� ��6�� ��9�� �� �� �ִ� ���� ������ �ʴ´�.

  1 2 3 4 5 6 7 8 9��

2. "3" "6" "9"�� �� �ִ� ���� ������ �ʴ´��, �ڼ��� ģ��. �� ��, �ڼ��� �ش� ���ڰ� �� ������ŭ �ľ� �Ѵ�.  
���� ��� ���� 35�� ��� �ڼ� �� ��, ���� 36�� ��� �ڼ��� �ι� �ľ� �Ѵ�.
 

�Է����� ���� N �� �־����� ��, 1~N ������ ���ڸ�

���� ��Ģ�� �°� ����ϴ� ���α׷��� �ۼ��϶�.

�ڼ��� ġ�� �κ��� ���� ���, �ڼ� Ƚ���� �°� ��-�� �� ����Ѵ�.

���⼭ �����ؾ� �� ���� �ڼ� �� �� ĥ ���� - �̸�, �ڼ��� �� �� ĥ ���� - - �� �ƴ� -- �̴�. 
 

[�������]

N�� 10�̻� 1,000������ �����̴�. (10 �� N �� 1,000)

 

[�Է�]

�Է����� ���� N �� �־�����.

100

[���]

1 ~ N������ ���ڸ� ���� ��Ģ�� �°� ����Ѵ�.

1 2 - 4 5 - 7 8 - 10 11 12 - 14 15 - 17 18 - 20 21 22 - 24 25 - 27 28 - - - - -- - - -- - - -- 40 41 42 - 44 45 - 47 48 - 50 51 52 - 54 55 - 57 58 - - - - -- - - -- - - -- 70 71 72 - 74 75 - 77 78 - 80 81 82 - 84 85 - 87 88 - - - - -- - - -- - - -- 100

 */
import java.util.Scanner;

public class Solution_SWEA_1926_������369����_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 100; i <= num; i++) {
			boolean flag = false;
			int h = i/100;
			int t = i/10;
			if (h>0) {
				if (h % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
				if (t%10 != 0&&t%10 % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
				if (i%10 != 0 && i%10 % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
			}
			else if(t>0) {
				if (t % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
				if (i%10 != 0&&i % 10 % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
			}else {
				if (i % 3 == 0) {
					System.out.print("-");
					flag = true;
				}
			}
			if (!flag) System.out.print(i);
			System.out.print(" ");
		}
	}//end of main
}//end of class


//import java.util.Scanner;
//
//public class SWEA_Solution_1926_������369����_kylie {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for (int i = 1; i <= num; i++) {
//			boolean flag = false;
//			if(i<10) {
//				if(i%3 == 0) System.out.print("-");
//				else System.out.print(i);
//				
//			}else if(i<100) {
//				if((i/10)%3 == 0) {
//					System.out.print("-");
//					flag = true;
//				}
//				if(i%3 == (i/10)%3) {
//					if(i%10!=0) {
//						System.out.print("-");
//						flag = true;
//					}
//				}
//				if(!flag) System.out.print(i);
//				
//			}
//			System.out.print(" ");
//		}
//	}//end of main
//}//end of class





























