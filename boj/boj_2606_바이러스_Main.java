import java.util.Arrays;
import java.util.Scanner;

/**
 * 신종 바이러스인 웜바이러스는 네트워크를 통해 전파된다.
 * 한 컴퓨터가 웜바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
 * 예를 들어 7대의 컴퓨터가  그림1과 같이 네트워크상에서 연결되어있다고 하자.
 * 1번 컴퓨터가 웜바이러스에 걸리면 웜바이러스는 2번과 5번컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2,3,5,6 네대의 컴퓨터는 웜바이러스에 걸리게 된다.
 * 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어있지 않기 때문에 영향을 받지 않는다.
 * 어느날 1번 컴퓨터가 웜바이러스에 걸렸다. 컴퓨터의 수와 네트워크상에서 서로 연결되어 있는 정보가 주어질때 1번 컴퓨터를 통해 웜바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오
컴퓨터수 C (1<= C <=100) 
간선의 수 E 
E개의 간선 정보
[input]
7
6
1 2
2 3
1 5
5 2
5 6
4 7

6
5
3 4
4 5
5 6
1 2
2 3
5 ->2 fail
 * 바이러스걸린 컴퓨터에 연결된 컴은 모두 감염된다. -> 팀별로 관리(Disjoint-Set)
 * Disjoint-Set : 서로소 집합 (서로 중복포함된 원소가 없는 집합)
 * 		대표자를 설정하여 대표자 기준으로 같은 집합인지 비교함
 * 		주로 연결리스트, 트리를 사용하여 집합을 나타냄
 * 		
 *		* MakeSet(int x) : 각각 스스로 집합의 대표자가 됨
 *		* FindSet(int x) : x 멤버 집합의 대표자를 찾는 메서드
 *		* Union(int x, int y) : x 멤버집합과 y 멤버집합을 하나의 집합으로 합침
 * 
 */
public class boj_2606_바이러스_Main {
	static int[] vertex;
	private static void makeSet(int x){
		 vertex[x] = x;
	}
	private static int findSet(int x) {
		if (vertex[x] == x) return x;
		else {
			vertex[x] = findSet(vertex[x]);
			return vertex[x];
		}
	}
	private static void unionSet(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		if(x != y) {
			vertex[y] = x;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = sc.nextInt();
		int E = sc.nextInt();
		vertex = new int[com+1];
		for (int i = 0; i < vertex.length; i++) {
			makeSet(i);
		}
		System.out.println(Arrays.toString(vertex));
		for (int i = 0; i < E; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			unionSet(x,y);
		}
		System.out.println(Arrays.toString(vertex));
		int cnt = 0;
		for (int i = 1; i < vertex.length; i++) {
			if (findSet(i) == findSet(1)) cnt++;
		}
		System.out.println(cnt-1);
	}
}


















