/**
 * 서로소 집합들 disjoint set
 * 	=> 같은 그룹인지 필요한 경우, 그룹을 합치는 경우에 용이
 * 
 * makeSet : 유일한 멤버 x를 포합하는 새로운 집합을 생성하는 연산
 * findSet : x를 포함하는 집합을 찾는 연산
 * union : x와 y를 포함하는 두 집합을 통합하는 연산
 * link : //랭크가 깊어지지 않도록 합치기
 * 
 *
 */
public class Z30_DisjointSet {
	public static int[] p = new int[10]; //부모를 저장할 배열
	public static int[] rank = new int[p.length];	//깊이를 저장할 배열
	public static void main(String[] args) {
		for (int i = 0; i < p.length; i++) {
			makeSet(i);
		}
		printSet();
		union(0,1);		printSet();
		union(2,3);		printSet();
		union(0,3);		printSet();
		union(4,5);		printSet();
		union(6,7);		printSet();
		union(4,7);		printSet();
		union(3,5);		printSet();
		union(1,8);		printSet();
		union(0,9);		printSet();
		
	}//end of main
	/** 일반멤버 x, 일반멤버 y를 포함하는 두 집합을 통합 */
	public static void union(int x, int y) {
		int px = findSet(x);	//대표자 찾아오기
		int py = findSet(y);	
		
		if(px != py) {	// 다른 집합일때만 합치기
			link(px, py);	//랭크가 깊어지지 않도록 합치기
//			p[py] = px;	// y집합의 대표자 인덱스에 x집합의 대표자를 넣는다.
		}
	}
	/** x의 대표자집합과 y의 대표자집합의 rank값을 기준으로 합친다.
	 * rank값이 작은 집합을 큰 집합에 편입시킨다.*/
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = px; // 작은 쪽을 큰쪽에 넣는다.
		}else { 
			p[px] = py;
			if (rank[px] == rank[py]) {// 같은 경우에는 rank값이 증가한다.
				rank[py]++;
			}
		}
	}
	/** 멤버 x를 포합하는 집합을 찾아서 대표자를 리턴*/
	public static int findSet(int x) {
		if(p[x] == x) {
			return x;
		}else {
			return p[x]= findSet(p[x]);//Path compression
		}
	}
	/**멤버 x를 포함하는 새로운 집합을 생성*/
	public static void makeSet(int x) {
		p[x] = x;	//부모를 자기자신 index 로 지정
//		rank[x] = 0;	//초기값이 0이므로 초기화하지 않아도 됨.
	}
	/** 내용구성 출력*/
	public static void printSet() {
//		0 1 2 3 4 5 6 
		System.out.print("index  : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d " , i);	//배열의 인덱스 출력
		}
		System.out.println();
		System.out.print("Parent : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", p[i]);//배열의 부모 출력
		}
		System.out.println();
		System.out.print("rank   : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", rank[i]);//랭크 (깊이정보)출력
		}
		System.out.println("\n=======================================");
	}
}//end of class
