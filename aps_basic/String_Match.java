import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Match {
	static int[] getPi(String pattern) {
		int[] pi = new int[pattern.length()];
		int j = 0;
		for (int i = 1; i < pattern.length(); i++) {
			// �´� ���
			if (pattern.charAt(i) == pattern.charAt(j)) {
				// i���� ���ڿ��� ������̴� j�� ��ġ +1
				pi[i] = ++j;
			}
			// �ȸ´� ���
			else {
				// �´� ���� �� ������ �ϳ� �� ĭ������ ����κ� ��ġ�� �̵�
				while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
					j = pi[j - 1];
				}
			}
		}
		return pi;
	}

	static void KMP(String origin, String pattern) {
		int[] pi = getPi(pattern);
		int j = 0;
		for (int i = 0; i < origin.length(); i++) {
			while (j > 0 && origin.charAt(i) != pattern.charAt(j)) {
				j = pi[j - 1];
			}
			// �´� ���
			if (origin.charAt(i) == pattern.charAt(j)) {
				if (j == pattern.length() - 1) {
					cnt++;
					sb.append(i - pattern.length() + 2 + " ");
					j = pi[j];
				} else
					j++;
			}
		}
	}

	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String origin = br.readLine();
		String pattern = br.readLine();
		KMP(origin, pattern);
		System.out.println(cnt);
		System.out.println(sb);
	}
}
