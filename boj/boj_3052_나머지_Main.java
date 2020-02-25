import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_3052_³ª¸ÓÁö_Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine())%42;
		}
		int cnt = 0;
		boolean f = false;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					f = true;
				}
			}
			if (!f) {
				cnt++;
			}
			f = false;
		}
		System.out.println(cnt);
	}//end of main
}//end of class
