import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
10
123 1
2737 1
757148 1
78466 2
32888 2
777770 5
436659 2
431159 7
112233 3
456789 10

 */
public class Solution_SWEA_1244_최대상금_D3_한지혜 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 0; t < tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			int c = Integer.parseInt(st.nextToken());
//			System.out.println(num.charAt(0) + ", " + c);
			char[] numArr = num.toCharArray();
			for (int i = 0; i < c; i++) {
				char max = 0;
				int maxIdx = -1;
				for (int j = i+1; j < numArr.length; j++) {
					if (numArr[j] >= max) {
						max = numArr[j];
						maxIdx = j;
					}
				}
				char tmp = numArr[i];
				numArr[i] = numArr[maxIdx];
				numArr[maxIdx] = tmp;
			}
			System.out.println(Arrays.toString(numArr));
			
		}
	}//end of main
}//end of class
