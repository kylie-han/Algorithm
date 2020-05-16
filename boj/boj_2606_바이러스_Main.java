import java.util.Arrays;
import java.util.Scanner;

/**
 * ���� ���̷����� �����̷����� ��Ʈ��ũ�� ���� ���ĵȴ�.
 * �� ��ǻ�Ͱ� �����̷����� �ɸ��� �� ��ǻ�Ϳ� ��Ʈ��ũ �󿡼� ����Ǿ� �ִ� ��� ��ǻ�ʹ� �� ���̷����� �ɸ��� �ȴ�.
 * ���� ��� 7���� ��ǻ�Ͱ�  �׸�1�� ���� ��Ʈ��ũ�󿡼� ����Ǿ��ִٰ� ����.
 * 1�� ��ǻ�Ͱ� �����̷����� �ɸ��� �����̷����� 2���� 5����ǻ�͸� ���� 3���� 6�� ��ǻ�ͱ��� ���ĵǾ� 2,3,5,6 �״��� ��ǻ�ʹ� �����̷����� �ɸ��� �ȴ�.
 * ������ 4���� 7�� ��ǻ�ʹ� 1�� ��ǻ�Ϳ� ��Ʈ��ũ�󿡼� ����Ǿ����� �ʱ� ������ ������ ���� �ʴ´�.
 * ����� 1�� ��ǻ�Ͱ� �����̷����� �ɷȴ�. ��ǻ���� ���� ��Ʈ��ũ�󿡼� ���� ����Ǿ� �ִ� ������ �־����� 1�� ��ǻ�͸� ���� �����̷����� �ɸ��� �Ǵ� ��ǻ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
��ǻ�ͼ� C (1<= C <=100) 
������ �� E 
E���� ���� ����
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
 * ���̷����ɸ� ��ǻ�Ϳ� ����� ���� ��� �����ȴ�. -> ������ ����(Disjoint-Set)
 * Disjoint-Set : ���μ� ���� (���� �ߺ����Ե� ���Ұ� ���� ����)
 * 		��ǥ�ڸ� �����Ͽ� ��ǥ�� �������� ���� �������� ����
 * 		�ַ� ���Ḯ��Ʈ, Ʈ���� ����Ͽ� ������ ��Ÿ��
 * 		
 *		* MakeSet(int x) : ���� ������ ������ ��ǥ�ڰ� ��
 *		* FindSet(int x) : x ��� ������ ��ǥ�ڸ� ã�� �޼���
 *		* Union(int x, int y) : x ������հ� y ��������� �ϳ��� �������� ��ħ
 * 
 */
public class boj_2606_���̷���_Main {
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


















