import java.util.Scanner;

/**
 * ���� n �� m�� �Է¹޾� 1���� n������ ������ m���� ������ ����Ѵ�.
 * @author jh han
 *
 */
public class n��m2_Main {
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
		if (depth == m) {//��������� ���
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}else {//������϶�
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
