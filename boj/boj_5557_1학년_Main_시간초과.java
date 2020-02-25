import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 시간초과로 실패.
 * @author multicampus
 *
 */
public class boj_5557_1학년_Main_시간초과 {
	public static long o;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inData = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			inData[i] = Integer.parseInt(st.nextToken());
		}
		////////////////입력///////////////////
		dfs(inData,inData[0],0);
		System.out.println(o);
	}//end of main
	private static void dfs(int[] inData, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}//end of class
