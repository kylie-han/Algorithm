import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * �ð��ʰ��� ����.
 * @author multicampus
 *
 */
public class boj_5557_1�г�_Main_�ð��ʰ� {
	public static long o;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inData = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			inData[i] = Integer.parseInt(st.nextToken());
		}
		////////////////�Է�///////////////////
		dfs(inData,inData[0],0);
		System.out.println(o);
	}//end of main
	private static void dfs(int[] inData, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}//end of class
