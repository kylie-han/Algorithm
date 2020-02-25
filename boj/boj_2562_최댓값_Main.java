import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2562_ÃÖ´ñ°ª_Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[9];
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (num[i] >= max) {
				max = num[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}//end of main
}//end of class
