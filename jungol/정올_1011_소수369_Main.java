import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_1011_�Ҽ�369_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		long start = System.currentTimeMillis();
		int[] student = new int[N];
		int[] memo = new int[100000];
		boolean f = false;
		int idx = 0;
		memo[idx] = 2;
		student[1]++;
		for (int i = 3; i < M; i++) { // i : M���� ��ĥ ����
			for (int j = 0; j<= idx; j++) { // j : �޸�迭�� �ε���, ä���� �ε������� ���Ϸ���
				if (i % memo[j] == 0 && memo[j] >= Math.sqrt(M)) { // i(��ģ ����)�� �Ҽ��� �ƴϸ� f�� false
					f = false;
					break;
				}
				// i(��ģ ����)�� �Ҽ��̸� flag(f)�� true�� ����, memo�� ������ �ε��� ������ ����
				f = true;
			}
			if (f) {
				idx++;
				memo[idx] = i;
				student[(i - 1) % N]++;
			}
		}
		System.out.println(student[K]);
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}// end of main
}// end of class
