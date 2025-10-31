import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
최소비용 신장트리 : 모든 정점을 사이클 없이 방문하는데 사용되는 간선의 가중치의 합이 최소가 되는 트리
풀이법 : 
1. prim 알고리즘
	정점선택 기준
	1) 시작 정점을 mst에 추가한다.
	2) mst list의 객체에 인접한 정점중 최소 가중치의 간선을 고른다.
	3) list의 값이 n-1일 경우까지 반복한다. 

2. kruskal 알고리즘
	각 간선이 사이클을 이루지 않는 선에서 최소의 가중치 합을 고르는것 
	간선의 가중치 기준
	greedy algorith(탐욕적)
	1) 간선들을 가중치 기준으로 오름차순 정렬
	2) 가중치 작은 것부터 사이클이 생기는지 확인하고 생기면 Pass, 생기지 않으면 mst list에 추가
 * @author hangj
 *
 */
public class KruskalTest {
	
	static int[] parents;
	static int[] rank;

	public static void main(String[] args) {
		List<MST> list = new ArrayList<MST>();
		int vertex = 7;
		int N = 10; // 간선의 갯수
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
			// 간선들을 가중치 오름차순 정렬
		list.sort(new Comparator<MST>() {

			@Override
			public int compare(MST o1, MST o2) {
				return Integer.compare(o1.add, o2.add);
			}
		});
		// 확인
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
		// 정점의 갯수 -1번 반복하면서 간선이 연결하는 두 정점이 사이클이 없다면(같은 팀이 아니라면, 팀장이 다르다면) 선택, 병합
		// 같은 팀(사이클 생김)은 패스
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