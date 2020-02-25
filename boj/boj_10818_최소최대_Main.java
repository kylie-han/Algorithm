import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//public class boj_10818_置社置企_Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		st = new StringTokenizer(br.readLine());
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(arr);
//		int min = arr[0];
//		int max = arr[arr.length-1];
//		System.out.println(min + " " + max);
//	}//end of main
//}//end of class
public class boj_10818_置社置企_Main {
	static BufferedReader br;
	static StringTokenizer st;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int inData = Integer.parseInt(st.nextToken());
			if (inData<min) {
				min = inData;
			}
			if (inData > max) {
				max = inData;
			}
		}
		bw.write(min+" "+max);
		bw.flush();
	}//end of main
}//end of class
