import java.util.Scanner;

/**
 * 정수 n 과 m을 입력받아 1부터 n까지의 정수중 m개를 순열로 출력한다.
 * @author jh han
 *
 */
public class n과m2_Main {
	static int []arr;
	static boolean[]used;
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1];
		used = new boolean[n+1];
		dfs(0);
	}//end of main

	public static void dfs(int depth) {
		// TODO Auto-generated method stub
		if (depth == m) {//리프노드일 경우
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}else {//노드중일때
			for (int i = 1; i <= n; i++) {
				if(used[i]||(depth !=0&&i<arr[depth-1])) continue;
				used[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				used[i] = false;
			}
		}
	}
}//end of class
