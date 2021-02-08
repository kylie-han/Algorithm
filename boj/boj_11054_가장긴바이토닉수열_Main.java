import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11054_가장긴바이토닉수열_Main {
	static int N, ans;
	static int[] arr, dpInc, dpDec;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dpInc = new int[N];
		dpDec = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dpInc[0] = 1;
		for (int i = 1; i < dpInc.length; i++) {
			dpInc[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dpInc[j] + 1 > dpInc[i]) {
					dpInc[i] = dpInc[j] + 1;
				}
			}
		}
		dpDec[N - 1] = 1;
		for (int i = N - 2; i >= 0; i--) {
			dpDec[i] = 1;
			for (int j = N-1; j >= i; j--) {
				if (arr[j] < arr[i] && dpDec[j] + 1 > dpDec[i]) {
					dpDec[i] = dpDec[j] + 1;
				}
			}
		}
		System.out.println(Arrays.toString(dpInc));
		System.out.println(Arrays.toString(dpDec));
		ans = 0;
		for (int i = 0; i < dpDec.length; i++) {
			ans = Math.max(dpInc[i] + dpDec[i], ans);
		}
		System.out.println(ans-1);
	}
}
