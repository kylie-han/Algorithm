import java.util.LinkedList;
import java.util.Scanner;

public class Solution_SWEA_1228_암호문1_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testCase = 1; testCase <= 10; testCase++) {
			int len = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < len; i++) {
				list.add(sc.nextInt());
			}
			int cmd = sc.nextInt();
			for (int i = 0; i < cmd; i++) {
				sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for (int k = 0; k < y; k++) {
					int s = sc.nextInt();
					list.add(x++, s);
				}
			} 
			System.out.print("#" + testCase);
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + list.get(i));
			}
			System.out.println();
		}
	}//end of main
}//end of class
