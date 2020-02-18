import java.util.Scanner;

/**
 * ����Ž��Ʈ�� Binary Search Tree
 * ������ : �迭
 * �������� : ����Ž��Ʈ������ ������ �ʴ� ���ڷ� �ʱ�ȭ�ϱ� 

8
9 4 12 15 6 13 3 17
4
0
8						//�Է��� ������ ����N
9 4 5 12 15 6 13 3 17	//N���� ������ȣ
4						//������ ��� (���� ���� ������ ���ٰ� ���)
0						//0�� ����

 *
 */
public class Z41_����Ž��Ʈ�� {
	public static int[] BST;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BST = new int[1<<(N+1)];	//�־��� ��� ��������Ʈ�� ���
		for (int i = 0; i < N; i++) {
			insert(sc.nextInt());//��������
		}
		System.out.println("������ȸ (�������� ����): ");
		inOrder(1);
		System.out.println();
		System.out.println("=========����========");
		while(true) {
			int removeNode = sc.nextInt();
			if(removeNode == 0)break;
			System.out.println(removeNode);
			delete(removeNode);
			System.out.println("������ȸ (�������� ����): ");
			inOrder(1);
			System.out.println();
		}
	}//end of main
	/**������ȣ�� �޾Ƽ� �����ϴ��� Ȯ�� �� deleteNode ȣ��*/
	public static void delete(int num) {
		int node = search(num);
		if(node >0) {
			deleteNode(node);
		} else {
			System.out.println("[����] �����˻�Ʈ����" + num + "���� �������� �ʽ��ϴ�");
		}
	
	}
	public static void deleteNode(int node) {
		if(BST[node*2] ==0 && BST[node *2+1] == 0) {	//������ 0
			BST[node] = 0;
		}else if (BST[node*2] !=0 && BST[node *2+1] == 0) {
			//���� ����Ʈ���� ���� ū���� �����ؿ��� => ���� ������ �ڸ��� Ű���ֱ�
			int subNode = findMax(node*2);
			BST[node] = subNode;
			deleteNode(subNode);
		}else {//if (BST[node*2] ==0 && BST[node *2+1] != 0) {
			//���� ����Ʈ���� ���� ū���� �����ؿ��� => ���� ������ �ڸ��� Ű���ֱ�
			int subNode = findMin(node*2+1);
			BST[node] = BST[subNode];
			deleteNode(subNode);
//		}else {
		}
	}
	public static int findMin(int node) {
		if (node*2 < BST.length && BST[node*2]!=0 ) {
			node = findMin(node * 2);
		}
		return node;
	}
	/**���� ū ���� �ε����� ����*/
	public static int findMax(int node) {
		if (node*2+1 < BST.length && BST[node*2+1]!=0 ) {
			node = findMax(node * 2 + 1);
		}
		return node;
	}
	/**������ȸ ��������*/
	public static void inOrder(int node) {
		if (node >= BST.length || BST[node] == 0) return;
		inOrder(node * 2);
		System.out.println(BST[node] + " ");
		inOrder(node * 2+1);
	}
	public static void insert(int num) {
		int node = search(num);//Ž�� �� ���� �� ���� ��ġ�� ���԰���, ������ ���ԺҰ�
		if (node >0) {//�����ϸ� ���ԺҰ� BST�� �ߺ����� ���� �� �� ����.
			System.out.println("[����] �����˻�Ʈ������ �ߺ����� ������ �� �����ϴ�." + num);
		}else {//�������� ������ ���԰���
			BST[-node] = num;
		}
	}
	/** BST�� num�� �ִ��� ã��, ã���� index����, ������ ������ ��ġ index �� ������ ����*/
	public static int search(int num) {
		int node = 1;
		while(node < BST.length && BST[node] != 0) {
			if (num == BST[node]) {	//ã��
				return node;
			} else if(num < BST[node]) {//���� ������ �������� Ž��
				node = node*2;	//�����ڽ� �ε���
			} else {
				node = node*2+1;
			}
		}
		return -node;	//�� ã���� ���������� ����
	}
}
