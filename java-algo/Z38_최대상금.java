import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Greedy Ž���� : �ڵ尣��, �ӵ��� ���� ���� ������ ������ �ִٸ�, ���� ���� �� ����. -> Backtracking
 */
public class Z38_�ִ��� {
	private static int max;
	private static HashSet<String> set;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			int[] num = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {// �Էµ� ���ڸ� �����迭�� �������
				num[i] = s.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken());
			max = 0;
			find(num, N);
			sb.append("#").append(t).append(" ").append(max).append("\n");
		} // end of for tc
		System.out.print(sb);
	}// end of main

	/**
	 * 
	 * @param num : ������ �迭
	 * @param N   : ���� ��ȯȽ��, ���� ��ȯȽ���� �̿��ؼ� ������ �ٲ㺸�� �ִ��� ã��
	 */
	public static void find(int[] num, int N) {
		// �������� ���ڷ� ������
		set = new HashSet<String>();
		int val = 0; // �ִ���(���ڰ�)�� ���� ����
		for (int i = 0; i < num.length; i++) {
			val = val * 10 + num[i];
		}
		if (set.contains("" + val + N)) {//�ߺ�üũ
			return;
		}else {
			set.add("" + val + N);

		}
		if (N == 0) { // ������Ʈ
			// �ִ밪 ����
			if (max < val) {
				max = val;
			}
		} else { // �����Ʈ
			// ���� �ڸ� 2�� ����(����)�� �ѹ� �ٲٱ�
			for (int i = 0; i < num.length - 1; i++) {
				for (int j = i; j < num.length; j++) {
					// num i ��° j��° swap`
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					find(num, N - 1);
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
	}
}// end of class
