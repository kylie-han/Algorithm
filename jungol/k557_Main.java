import java.util.Scanner;

public class k557_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		System.out.println(arr[0]+" "+arr[6]+" "+arr[12]);
	}
}