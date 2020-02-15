import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_1225_암호생성기 {
	public static int front = -1;
	public static int rear = -1;
	public static int[] arr = new int[8];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//8자리 숫자 입력
		for (int i = 1; i <= 10; i++) {
			int testCase = sc.nextInt();
			for (int j = 0; j < 8; j++) {
				arr[j] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(arr));
			int index = 0;
			boolean flag = true;
			while (flag) {
				for (int j = 1; j <= 5; j++) {
					arr[index] -= j;
//					System.out.println(index + " : " +arr[index]);
					if(arr[index]<=0) {
						arr[index] = 0;
						flag = false;
						break;
					}
					if (index >= arr.length-1) index = 0;
					else index++;
				}
			}
			System.out.print("#" + testCase);
			for (int j = 0; j < arr.length; j++) {
				++index;
				if (index > arr.length-1) index = 0;
				System.out.print(" "+arr[index]);
			}
			System.out.println();
		}
	}//end of main
}//end of class
