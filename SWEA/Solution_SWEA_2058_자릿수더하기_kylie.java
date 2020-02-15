import java.util.Scanner;

public class Solution_SWEA_2058_자릿수더하기_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(+num/1000 + (num%1000)/100 + ((num%1000)%100)/10 + ((num%1000)%100)%10);
	}
}
