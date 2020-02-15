/**
 * ���μ� ���յ� disjoint set
 * 	=> ���� �׷����� �ʿ��� ���, �׷��� ��ġ�� ��쿡 ����
 * 
 * makeSet : ������ ��� x�� �����ϴ� ���ο� ������ �����ϴ� ����
 * findSet : x�� �����ϴ� ������ ã�� ����
 * union : x�� y�� �����ϴ� �� ������ �����ϴ� ����
 * link : //��ũ�� ������� �ʵ��� ��ġ��
 * 
 *
 */
public class Z30_DisjointSet {
	public static int[] p = new int[10]; //�θ� ������ �迭
	public static int[] rank = new int[p.length];	//���̸� ������ �迭
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
	/** �Ϲݸ�� x, �Ϲݸ�� y�� �����ϴ� �� ������ ���� */
	public static void union(int x, int y) {
		int px = findSet(x);	//��ǥ�� ã�ƿ���
		int py = findSet(y);	
		
		if(px != py) {	// �ٸ� �����϶��� ��ġ��
			link(px, py);	//��ũ�� ������� �ʵ��� ��ġ��
//			p[py] = px;	// y������ ��ǥ�� �ε����� x������ ��ǥ�ڸ� �ִ´�.
		}
	}
	/** x�� ��ǥ�����հ� y�� ��ǥ�������� rank���� �������� ��ģ��.
	 * rank���� ���� ������ ū ���տ� ���Խ�Ų��.*/
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = px; // ���� ���� ū�ʿ� �ִ´�.
		}else { 
			p[px] = py;
			if (rank[px] == rank[py]) {// ���� ��쿡�� rank���� �����Ѵ�.
				rank[py]++;
			}
		}
	}
	/** ��� x�� �����ϴ� ������ ã�Ƽ� ��ǥ�ڸ� ����*/
	public static int findSet(int x) {
		if(p[x] == x) {
			return x;
		}else {
			return p[x]= findSet(p[x]);//Path compression
		}
	}
	/**��� x�� �����ϴ� ���ο� ������ ����*/
	public static void makeSet(int x) {
		p[x] = x;	//�θ� �ڱ��ڽ� index �� ����
//		rank[x] = 0;	//�ʱⰪ�� 0�̹Ƿ� �ʱ�ȭ���� �ʾƵ� ��.
	}
	/** ���뱸�� ���*/
	public static void printSet() {
//		0 1 2 3 4 5 6 
		System.out.print("index  : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d " , i);	//�迭�� �ε��� ���
		}
		System.out.println();
		System.out.print("Parent : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", p[i]);//�迭�� �θ� ���
		}
		System.out.println();
		System.out.print("rank   : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", rank[i]);//��ũ (��������)���
		}
		System.out.println("\n=======================================");
	}
}//end of class
