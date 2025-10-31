import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
�ּҺ�� ����Ʈ�� : ��� ������ ����Ŭ ���� �湮�ϴµ� ���Ǵ� ������ ����ġ�� ���� �ּҰ� �Ǵ� Ʈ��
Ǯ�̹� : 
1. prim �˰���
	�������� ����
	1) ���� ������ mst�� �߰��Ѵ�.
	2) mst list�� ��ü�� ������ ������ �ּ� ����ġ�� ������ ����.
	3) list�� ���� n-1�� ������ �ݺ��Ѵ�. 

2. kruskal �˰���
	�� ������ ����Ŭ�� �̷��� �ʴ� ������ �ּ��� ����ġ ���� ���°� 
	������ ����ġ ����
	greedy algorith(Ž����)
	1) �������� ����ġ �������� �������� ����
	2) ����ġ ���� �ͺ��� ����Ŭ�� ������� Ȯ���ϰ� ����� Pass, ������ ������ mst list�� �߰�
 * @author hangj
 *
 */
public class KruskalTest {
	
	static int[] parents;
	static int[] rank;

	public static void main(String[] args) {
		List<MST> list = new ArrayList<MST>();
		int vertex = 7;
		int N = 10; // ������ ����
		String input = "A E 21" + "\n" + "A F 5" + "\n" + "B C 4" + "\n" + "B E 7" + "\n" + "B G 9" + "\n" + "C D 2"
				+ "\n" + "C G 19" + "\n" + "D E 9" + "\n" + "E F 1" + "\n" + "E G 19" + "\n";
		Scanner sc = new Scanner(input);
		for (int i = 0; i < N; i++) {
			MST a = new MST();
			a.s = sc.next().charAt(0);
			a.e = sc.next().charAt(0);
			a.add = sc.nextInt();
			list.add(a);
		} // input
			// �������� ����ġ �������� ����
		list.sort(new Comparator<MST>() {

			@Override
			public int compare(MST o1, MST o2) {
				return Integer.compare(o1.add, o2.add);
			}
		});
		// Ȯ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

		parents = new int[vertex + 1];
		rank = new int[vertex + 1];
		for (int i = 0; i < vertex; i++) {
			makeSet(i);
		}
		int result = 0;
		int cnt = 0;
		// ������ ���� -1�� �ݺ��ϸ鼭 ������ �����ϴ� �� ������ ����Ŭ�� ���ٸ�(���� ���� �ƴ϶��, ������ �ٸ��ٸ�) ����, ����
		// ���� ��(����Ŭ ����)�� �н�
		for (int i = 0; i < N; i++) {
			System.out.println(Arrays.toString(parents));
			System.out.println(Arrays.toString(rank));
			int a = findSet(list.get(i).s - 'A');
			int b = findSet(list.get(i).e - 'A');
			if (a == b)
				continue;
			union(a, b);
			result += list.get(i).add;
			cnt++;
			if (cnt == vertex - 1)
				break;
		}
		System.out.println(result);
	}

	static void makeSet(int x) {
		parents[x] = x;
	}

	static int findSet(int x) {
		if (x == parents[x])
			return x;
		else {
			parents[x] = findSet(parents[x]);
			return parents[x];
		}
	}

	static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		parents[px] = py;
//		if (rank[px] > rank[py]) {
//			parents[py] = px;
//		} else {
//			parents[px] = py;
//			if (parents[px] == rank[py]) {
//				rank[py]++;
//			}
//		}
	}
}

class MST {
	char s;
	char e;
	int add;

	@Override
	public String toString() {
		return "MST [s=" + s + ", e=" + e + ", add=" + add + "]";
	}
}