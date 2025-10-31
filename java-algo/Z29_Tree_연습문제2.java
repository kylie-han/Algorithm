import java.util.Arrays;
import java.util.Scanner;

/**
 * 트리의 표현 - 저장후 전위순회 레벨 4의 이진트리 루트의 정점은 번호 1
 * 
 * @author multicampus
 * 
 *         13 1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 *
 */
public class Z29_Tree_연습문제2 {
//						이진트리의 레벨이 4이면, 최대트리정점의 총갯수는 2^5개 이하다.
	public static int[] tree = new int[32]; // 간선에서 자식의 정점을 저장, 0번 정점은 사용안함

	public static void main(String[] args) {
		// 이진트리 작성
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		tree[1] = 1; // 루트 정점번호를 저장
		for (int i = 1; i < v; i++) {// v-1번 반복
			int p = sc.nextInt(); // 간선의 시작정점
			int c = sc.nextInt(); // 간선의 끝 정점

			// p와 같은 정점값을 찾기
			int j = -1;
			for (j = 1; j < tree.length; j++) {
				if (p == tree[j]) {// 같은 값 찾기
					break;
				}
			}
//			j 정점의 자식으로 등록, 왼쪽이 없으면, 왼쪽자식으로 등록, 왼쪽이 있으면 오른쪽자식으로 등록
			if (tree[j * 2] == 0) {// 왼쪽자식?
				tree[j * 2] = c;
			} else { // 오른쪽자식으로 등록
				tree[j * 2 + 1] = c;
			}
		}
		// 전위순회
		System.out.print("\n전위순회 : ");
		preOrder(1);
		// 중위순회
		System.out.print("\n중위순회 : ");
		inOrder(1);
		// 후위순회
		System.out.print("\n후위순회 : ");
		postOrder(1);
	}// end of main

	/** 후위 순회 재귀함수 */
	public static void postOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // 배열범위를 벗어나거나 자식이 없으면
			return;
		}
		// 왼쪽자식
		preOrder(index * 2);
		// 오른쪽자식
		preOrder(index * 2 + 1);
		// 부모
		System.out.print(tree[index] + " ");
	}

	/** 중위 순회 재귀함수 */
	public static void inOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // 배열범위를 벗어나거나 자식이 없으면
			return;
		}
		// 왼쪽자식
		preOrder(index * 2);
		// 부모
		System.out.print(tree[index] + " ");
		// 오른쪽자식
		preOrder(index * 2 + 1);
	}

	/** 전위 순회 재귀함수 */
	public static void preOrder(int index) {
		if (index >= tree.length || tree[index] == 0) { // 배열범위를 벗어나거나 자식이 없으면
			return;
		}
		// 부모
		System.out.print(tree[index] + " ");
		// 왼쪽자식
		preOrder(index * 2);
		// 오른쪽자식
		preOrder(index * 2 + 1);
	}
}// end of class
