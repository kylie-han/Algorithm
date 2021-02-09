import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_1541_ÀÒ¾î¹ö¸°°ýÈ£_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sub = br.readLine().split("-");
		int sum = 0;
		for (int i = 0; i < sub.length; i++) {
			String[] add = sub[i].toString().split("\\+");
			for (int j = 0; j < add.length; j++) {
				if(i == 0) {
					sum += Integer.parseInt(add[j]);
				}else {
					sum -= Integer.parseInt(add[j]);
				}
			}
		}
		System.out.println(sum);
	}

}
