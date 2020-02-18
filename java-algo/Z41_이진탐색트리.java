import java.util.Scanner;

/**
 * 이진탐색트리 Binary Search Tree
 * 저장방법 : 배열
 * 제약조건 : 이진탐색트리에서 사용되지 않는 숫자로 초기화하기 

8
9 4 12 15 6 13 3 17
4
0
8						//입력할 정점의 개수N
9 4 5 12 15 6 13 3 17	//N개의 정점번호
4						//삭제할 노드 (없는 노드는 삭제시 없다고 출력)
0						//0은 종료

 *
 */
public class Z41_이진탐색트리 {
	public static int[] BST;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BST = new int[1<<(N+1)];	//최악의 경우 편향이진트리 고려
		for (int i = 0; i < N; i++) {
			insert(sc.nextInt());//정점삽입
		}
		System.out.println("중위순회 (오름차순 정렬): ");
		inOrder(1);
		System.out.println();
		System.out.println("=========삭제========");
		while(true) {
			int removeNode = sc.nextInt();
			if(removeNode == 0)break;
			System.out.println(removeNode);
			delete(removeNode);
			System.out.println("중위순회 (오름차순 정렬): ");
			inOrder(1);
			System.out.println();
		}
	}//end of main
	/**정점번호를 받아서 존재하는지 확인 후 deleteNode 호출*/
	public static void delete(int num) {
		int node = search(num);
		if(node >0) {
			deleteNode(node);
		} else {
			System.out.println("[에러] 이진검색트리에" + num + "값은 존재하지 않습니다");
		}
	
	}
	public static void deleteNode(int node) {
		if(BST[node*2] ==0 && BST[node *2+1] == 0) {	//차수가 0
			BST[node] = 0;
		}else if (BST[node*2] !=0 && BST[node *2+1] == 0) {
			//좌측 서브트리의 가장 큰값을 삭제해오기 => 내가 삭제한 자리에 키워넣기
			int subNode = findMax(node*2);
			BST[node] = subNode;
			deleteNode(subNode);
		}else {//if (BST[node*2] ==0 && BST[node *2+1] != 0) {
			//우측 서브트리의 가장 큰값을 삭제해오기 => 내가 삭제한 자리에 키워넣기
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
	/**가장 큰 값의 인덱스를 리턴*/
	public static int findMax(int node) {
		if (node*2+1 < BST.length && BST[node*2+1]!=0 ) {
			node = findMax(node * 2 + 1);
		}
		return node;
	}
	/**중위순회 오름차순*/
	public static void inOrder(int node) {
		if (node >= BST.length || BST[node] == 0) return;
		inOrder(node * 2);
		System.out.println(BST[node] + " ");
		inOrder(node * 2+1);
	}
	public static void insert(int num) {
		int node = search(num);//탐색 후 없을 떄 없는 위치에 삽입가능, 있으면 삽입불가
		if (node >0) {//존재하면 삽입불가 BST는 중복값을 저장 할 수 없다.
			System.out.println("[에러] 이진검색트리에는 중복값을 저장할 수 없습니다." + num);
		}else {//존재하지 않으면 삽입가능
			BST[-node] = num;
		}
	}
	/** BST에 num이 있는지 찾기, 찾으면 index리턴, 없으면 들어가야할 위치 index 를 음수로 리턴*/
	public static int search(int num) {
		int node = 1;
		while(node < BST.length && BST[node] != 0) {
			if (num == BST[node]) {	//찾음
				return node;
			} else if(num < BST[node]) {//작은 쪽으로 왼쪽으로 탐색
				node = node*2;	//왼쪽자식 인덱스
			} else {
				node = node*2+1;
			}
		}
		return -node;	//못 찾으면 음수값으로 리턴
	}
}
