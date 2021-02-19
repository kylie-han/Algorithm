import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_10809_Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] alpha = new int[26];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}
		String str = br.readLine();
		for (int i = str.length()-1; i >= 0; i--){
			alpha[str.charAt(i)-'a'] = i;
		}
		for (int i : alpha) {
			sb.append(i+" ");
		}
		System.out.println(sb.toString());
		
	}
}
