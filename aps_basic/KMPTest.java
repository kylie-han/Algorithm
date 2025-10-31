
public class KMPTest {
	// ��� ��츦 �� ������ �ʾƵ� �κ� ���ڿ��� ã�� �� �ִ� �˰���.
	
	
	// �������̺� : �� ���̺��� ���λ� == ���̻��� �ִ���̰� ����� �迭
	static int[] getPi(String pattern) {
		int []pi = new int[pattern.length()];
		int j = 0;
		for (int i = 1; i < pattern.length(); i++) {
			// �´� ���
			if(pattern.charAt(i) == pattern.charAt(j)) {
				// i���� ���ڿ��� ������̴� j�� ��ġ +1
				pi[i] = ++j;
			}
			// �ȸ´� ���
			else {
				// �´� ���� �� ������ �ϳ� �� ĭ������ ����κ� ��ġ�� �̵�
				while(j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
					j = pi[j-1];
				}
			}
		}
		return pi;
	}
	static void KMP(String origin, String pattern) {
		int[] pi = getPi(pattern);
		int j = 0;
		for (int i = 0; i < origin.length(); i++) {
			while(j >0 && origin.charAt(i) != pattern.charAt(j)){
				j = pi[j-1];
			}
			// �´� ���
			if (origin.charAt(i) == pattern.charAt(j)) {
				if (j == pattern.length() -1) {
					System.out.println("����" + (i - pattern.length() +1));
					j = pi[j];
				}
				else
					j++;
			}
		}
	}
	public static void main(String[] args) {
		String origin = "HELLOSSAFY";
		String pattern = "LOSS";
		KMP(origin, pattern);
	}
}
