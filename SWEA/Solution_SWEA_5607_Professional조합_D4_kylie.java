import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_5607_Professional¡∂«’_D4_kylie {
	static int P = 1234567891;
	static int N;
	static int R;
	static long[] facModP;	// memoization

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		facModP = new long[1000001];
		nFacModP();
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			long nr = facPowModP(P - 2, facModP[N - R] * facModP[R]%P);
			long result = (facModP[N] * nr) % P;
			System.out.println("#"+t+" "+result);
		}
	}// end of main

	private static long facPowModP(int c, long i) {
		if (c == 0) {
			return 1;
		}
		long result = facPowModP(c / 2, i);
		result = (result * result) % P;
		if (c % 2 == 1) {
			result = (result * i) % P;
		}
		return result;
	}

	private static void nFacModP() {
		int i = 1;
		facModP[0] = 1;
		while (i < facModP.length) {
			facModP[i] = (facModP[i - 1] % P) * (i % P) % P;
			i++;
		}
	}

}// end of class
