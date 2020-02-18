import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2798_B2_∫Ì∑¢¿Ë_Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] cardArr = new int[N];
		for (int i = 0; i < cardArr.length; i++) {
			st = new StringTokenizer(br.readLine());
			cardArr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
//		for (int i = 0; i < cardArr.length; i++) {
//			for (int j = i+1; j < cardArr.length; j++) {
//				for (int k = j+1; k < cardArr.length; k++) {
//					int sum = cardArr[i] + cardArr[j] + cardArr[k];
//					if(sum <= M && sum >= max) max = sum;
//				}
//			}
//		}
		System.out.println(max);
	}
}
