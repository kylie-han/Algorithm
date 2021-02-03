import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_10989_수정렬하기3_Main {
	static int N, maxNum;
	static int[] arr, ans, cntSum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		ans = new int[N+1];
		maxNum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > maxNum)maxNum = arr[i];
		}
		cntSum = new int[maxNum+1];
		for (int i = 0; i < N; i++) {
			cntSum[arr[i]]++;
		}
		for (int i = 1; i < cntSum.length; i++) {
			cntSum[i] = cntSum[i-1]+cntSum[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			ans[cntSum[arr[i]]--] = arr[i];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < ans.length; i++) {
			sb.append(ans[i] + "\n");
		}
		System.out.println(sb.toString());
	}
}
