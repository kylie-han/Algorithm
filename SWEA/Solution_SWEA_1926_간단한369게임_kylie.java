/**

3 6 9 게임을 프로그램으로 제작중이다. 게임 규칙은 다음과 같다.

 

1. 숫자 1부터 순서대로 차례대로 말하되, “3” “6” “9” 가 들어가 있는 수는 말하지 않는다.

  1 2 3 4 5 6 7 8 9…

2. "3" "6" "9"가 들어가 있는 수를 말하지 않는대신, 박수를 친다. 이 때, 박수는 해당 숫자가 들어간 개수만큼 쳐야 한다.  
예를 들어 숫자 35의 경우 박수 한 번, 숫자 36의 경우 박수를 두번 쳐야 한다.
 

입력으로 정수 N 이 주어졌을 때, 1~N 까지의 숫자를

게임 규칙에 맞게 출력하는 프로그램을 작성하라.

박수를 치는 부분은 숫자 대신, 박수 횟수에 맞게 “-“ 를 출력한다.

여기서 주의해야 할 것은 박수 한 번 칠 때는 - 이며, 박수를 두 번 칠 때는 - - 가 아닌 -- 이다. 
 

[제약사항]

N은 10이상 1,000이하의 정수이다. (10 ≤ N ≤ 1,000)

 

[입력]

입력으로 정수 N 이 주어진다.

100

[출력]

1 ~ N까지의 숫자를 게임 규칙에 맞게 출력한다.

1 2 - 4 5 - 7 8 - 10 11 12 - 14 15 - 17 18 - 20 21 22 - 24 25 - 27 28 - - - - -- - - -- - - -- 40 41 42 - 44 45 - 47 48 - 50 51 52 - 54 55 - 57 58 - - - - -- - - -- - - -- 70 71 72 - 74 75 - 77 78 - 80 81 82 - 84 85 - 87 88 - - - - -- - - -- - - -- 100

 */
import java.util.Scanner;

public class Solution_SWEA_1926_간단한369게임_kylie {
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
//public class SWEA_Solution_1926_간단한369게임_kylie {
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





























