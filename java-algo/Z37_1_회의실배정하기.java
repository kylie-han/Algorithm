import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Ž�� �˰���(Greedy) : �����ظ� ���ϴµ� ����ϴ� �ٽþ����� ��� ���翡�� ���������� ��������� �����̶�� ������ ���� Ȯ����
 * ������ ���Ŀ� ����ؾ� �� Knapsack(�賶) - �ɰ� �� �ִ��� - Ž�� �˰��� ���� - �ɰ� �� ������(0,1) - Ž��˰���
 * �Ұ�(����Ž��orDP�� ����) - �������� �ִ� ��� - �������� ���� ���
 * 
[input] 
10
1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14
 */
public class Z37_1_ȸ�ǽǹ����ϱ� {
	public static class Study implements Comparable<Study> {
		int s;
		int e;

		public Study(int s, int e) {
			this.s = s;
			this.e = e;
		}

		@Override
		public int compareTo(Study o) {
			return this.e - o.e;
		}

		@Override
		public String toString() {
			return "(" + s + "," + e + ")";
		}
		

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Study[] room = new Study[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			room[i] = new Study(a, b);
		}
		Arrays.sort(room);
//		System.out.println(Arrays.toString(room));
		Study s = room[0];
		int cnt = 1;
		System.out.print(0 + " ");
		for (int i = 1; i < room.length; i++) {
			if (s.e < room[i].s) {
				s = room[i];
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println("\n" + cnt);
	}// end of main
}// end of class
















