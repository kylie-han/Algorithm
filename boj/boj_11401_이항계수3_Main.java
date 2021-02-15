import java.util.Scanner;

public class boj_11401_이항계수3_Main {
	static int N, K;
	static final int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		long a = fac(N);
		long b = fac(K) * fac(N - K) % mod;
		long result = a * pow(b, mod - 2) % mod;
		System.out.println(result);
	}

	private static long pow(long a, int b) {
		long ret= 1;
		long aa = a;
		while (b > 0) {
			if (b%2 == 1) ret = ret * aa  % mod;
			b = b/2;
			aa = (aa * aa) % mod;
		}
		return ret;
	}
	private static long fac(int n) {
		long ret = 1;
		while (n > 1){
			ret = (ret * n) % mod;
			n--;
		}
		return ret;
	}
}
