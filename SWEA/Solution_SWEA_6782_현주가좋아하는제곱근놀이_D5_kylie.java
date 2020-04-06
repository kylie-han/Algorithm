import java.util.Scanner;
/**
 * 데이터타입체크 확실히!!
 * 입력될 데이터의 크기를 보고 입력데이터를 담을 수 있는지 확인할 필요가 있다. 
 * 이는 단순히 입력시 뿐만 아니라 데이터를 처리할때에도 필요하다.
 * @author hangj
 *
 */
public class Solution_SWEA_6782_현주가좋아하는제곱근놀이_D5_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int t = 1; t <= TC; t++) {
			long N = sc.nextLong();
			int cnt = 0;
			while (N>2) {
				double rN = Math.sqrt(N);
//				System.out.println("rN : "+rN);
				if (rN ==(int)rN) {
					N = (int)rN;
					cnt++;
					
				} else {
					long pN = (long) Math.pow((int)rN+1,2);
//					System.out.println("pN : "+pN+", pN-N : "+(pN-N));
					cnt += pN-N;
					N = pN;
				}
//				System.out.println("N = "+N+", cnt : "+cnt);
			}
			System.out.println("#"+t+" "+cnt);
		}
		sc.close();
	}
}
