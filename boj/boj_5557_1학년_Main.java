import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_5557_1학년_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inData = new int[n];	//11 (입력될 수의 개수)
		long[][] outData = new long[21][n-1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			inData[i] = Integer.parseInt(st.nextToken());
		}	//8 3 2 4 8 7 2 4 0 8 8
		////////////////입력///////////////////
		outData[inData[0]][0]++;
		for (int i = 1; i < n-1; i++) {
			for (int j = 0; j < 21; j++) {
				if (outData[j][i-1] > 0) {
					if(j+inData[i]<=20) {
						outData[j+inData[i]][i] += outData[j][i-1]; 
					}
					if (j-inData[i] >=0) {
						outData[j-inData[i]][i] += outData[j][i-1]; 
					}
				}
			}
		}
		System.out.println(outData[inData[n-1]][n-2]);
//		
//		for (int i = 0; i < outData.length; i++) {
//			System.out.println(Arrays.toString(outData[i]));
//		}
	}//end of main
}//end of class


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class boj_5557_1학년_Main_시간초과 {
//	static int[] outData = new int[21];
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int[] inData = new int[n];	//11 (입력될 수의 개수)
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < n; i++) {
//			inData[i] = Integer.parseInt(st.nextToken());
//		}	//8 3 2 4 8 7 2 4 0 8 8
//		////////////////입력///////////////////
//		dfs(inData,inData[0],0);
//		System.out.println(outData[8]);
//	}//end of main
//	private static void dfs(int[] inData, int i, int depth) {
//		if (i < 0 || i > 20) {
//			return;
//		} else if (depth == inData.length-2) {
//			outData[i]++;
//			return;
//		} else {
//			dfs(inData, i+inData[depth], depth+1);
//			dfs(inData, i-inData[depth], depth+1);
//		}
//	}
//}//end of class
