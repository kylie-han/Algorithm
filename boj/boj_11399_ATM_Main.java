import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11399_ATM_Main {
	static int N, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		N = Integer.parseInt(st.nextToken());
		int[] peopleArr = new int[N];
		st = new StringTokenizer(br.readLine().trim());
		for (int i = 0; i < peopleArr.length; i++) {
			peopleArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(peopleArr);
		int sum = 0;
		int minSum = 0;
		for (int i = 0; i < peopleArr.length; i++) {
			sum += peopleArr[i];
			minSum += sum;
		}
		ans = minSum;
		System.out.println(ans);
	}
}
