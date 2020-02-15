
/**
 * �ּҽ���Ʈ���� ã�� �˰��� Prim
 * => �ּ� ����ġ�� ���� ������ �ϳ��� ����
 * => �켱���� ť�� ����ϸ� ȿ�����̴�.
[input] ������ ���� V, ������ ���� E, ���� �����ٿ� E���� ��������(����1, ����2, ����ġ)
7 11
5 3 18
1 2 21
2 6 25
0 2 31
0 1 32
3 4 34
5 4 40
2 4 46
0 6 51
4 6 51
0 5 60
[output] ������ �������� (����1-����2 ����ġ) ���, MST��ü ����ġ�� ��
 */
//import java.util.Scanner;
//public class Z31_MST_prim{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int v = sc.nextInt();	
//		int e = sc.nextInt();
//		
//		int[][] g = new int[v][v];
//		for (int i = 0; i < e; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int val = sc.nextInt();
//			g[a][b] = g[b][a] = val;
//		}
//		//�Է´�
//	}//end of main
//}//end of class



import java.util.Arrays;

public class Z31_MST_prim {
	public static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[][] arr = {
				{INF, 32, 31,INF,INF, 60, 51},
				{ 32,INF, 21,INF,INF,INF,INF},
				{ 31, 21,INF,INF, 46,INF, 25},
				{INF,INF,INF,INF, 34, 18,INF},
				{INF,INF, 46, 34,INF, 40, 51},
				{ 60,INF,INF, 18, 40,INF,INF},
				{ 51,INF, 25,INF, 51,INF,INF},
		};
		int[] st = new int[7];
		int[] val = new int[7];
		Arrays.fill(val, INF);
		boolean[] visited = new boolean[7];
		int mini = 0; 
//		System.out.println(Arrays.toString(visited));
		val[0] = 0;
		st[0] = 0;
		visited[0] = true;
		while(true) {
			int minval = 70;
			for (int i = 0; i < st.length; i++) {
				if(!visited[i] && arr[mini][i] <= val[i]) {
					st[i] = mini;
					val[i] = arr[mini][i];
				}
			}
			for (int i = 0; i < visited.length; i++) {
				if(!visited[i] && val[i]<minval) {
					minval = val[i];
					mini = i;
				}
			}
			visited[mini] = true;
			System.out.println(Arrays.toString(st));
			System.out.println(Arrays.toString(val));
			System.out.println(Arrays.toString(visited));
			System.out.println("======================================");
			boolean f = true;
			for (int i = 0; i < visited.length; i++) {
				if(!visited[i]) f = false;
			}
			
			if(f)break;
			else continue;
		}
		int mst = 0;
		for (int i = 0; i < visited.length; i++) {
			mst += val[i];
		}
		System.out.println(mst);
	}//end of main
}//end of class
