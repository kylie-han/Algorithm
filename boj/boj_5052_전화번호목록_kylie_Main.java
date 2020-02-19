import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_5052_전화번호목록_kylie_Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < t; tc++) {
			boolean f = true;
			int n = Integer.parseInt(br.readLine());
			String[] number = new String[n];
			for (int i = 0; i < n; i++) {
				number[i] = br.readLine();
			}
			Arrays.sort(number);
			System.out.println(Arrays.toString(number));
			for (int j = 1; j < number.length; j++) {
				if (number[j].startsWith(number[j-1])) {
					f = false;
				}
			}
			System.out.println(f?"YES":"NO");
		} // end of for tc
	}// end of main
}// end of class
