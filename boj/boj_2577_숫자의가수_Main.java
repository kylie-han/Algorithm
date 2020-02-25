import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2577_숫자의가수_Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sub = 1;
		for (int i = 0; i < 3; i++) {
			sub *= Integer.parseInt(br.readLine());
		}
		String str = Integer.toString(sub);
		int[] arr = new int[10];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-48]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}//end of main
}//end of class
