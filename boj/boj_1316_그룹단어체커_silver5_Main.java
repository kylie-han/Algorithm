import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1316_그룹단어체커_silver5_Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < N; i++) {
			boolean[] check = new boolean[26];
			char[] charArr = br.readLine().toCharArray();
			int cnt = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (j != 0 && charArr[j] != charArr[j - 1] && check[charArr[j] - 'a']) {
					break;
				}
				check[charArr[j] - 'a'] = true;
				cnt++;
			}
			if (cnt == charArr.length) {
				result++;
			}
		}
		System.out.println(result);
	}
}
