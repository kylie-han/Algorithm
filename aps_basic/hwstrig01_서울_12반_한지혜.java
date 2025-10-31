import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwstrig01_서울_12반_한지혜 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String pattern = br.readLine();
		int[] pi = new int[pattern.length()];
		// getPi
		for (int i = 1, j = 0; i < pi.length; i++) {
			while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
				j = pi[j - 1];
			if (pattern.charAt(i) == pattern.charAt(j))
				pi[i] = ++j;
			else
				pi[i] = 0;
		}
		// KMP 같은 패턴
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 0, j = 0; i < str.length(); i++) {
			while (j > 0 && str.charAt(i) != pattern.charAt(j))
				j = pi[j - 1];
			if (str.charAt(i) == pattern.charAt(j)) {
				if (j == pattern.length() - 1) {
					sb.append(i - pattern.length() + 2 + " ");
					cnt++;
					j = pi[j];
				} else
					j++;
			}
		}
		System.out.println(cnt);
		System.out.println(sb);
	}
}