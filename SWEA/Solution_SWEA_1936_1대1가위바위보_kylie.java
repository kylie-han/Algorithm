import java.util.Scanner;

public class Solution_SWEA_1936_1대1가위바위보_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b&&(a!=3||b!=3)) System.out.print("A");
		else if(a==3&&b==1) System.out.print("A");
		else System.out.println("B");
	}
}
