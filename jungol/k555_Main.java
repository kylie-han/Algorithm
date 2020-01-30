import java.util.Scanner;

public class Main_555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char[] arr = new char[10];
		String str = new String();
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) System.out.print(arr[i]);
		}
	}
}
