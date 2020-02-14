import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 시간초과로 실패.
 * @author multicampus
 *
 */
public class boj_5557_1학년_Main {
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

	public static void dfs(int[] inData, int sum, int i) {
		if(sum>20 || sum <0) return;
		if(i == inData.length-2) {
			if(sum == inData[inData.length-1]) {
				o++;
			}
		}else {
			dfs(inData, sum+inData[i+1], i+1);
			dfs(inData, sum-inData[i+1], i+1);
		}
	}//end of main
}//end of class
