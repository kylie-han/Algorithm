import java.util.Scanner;
/**
 * ������Ÿ��üũ Ȯ����!!
 * �Էµ� �������� ũ�⸦ ���� �Էµ����͸� ���� �� �ִ��� Ȯ���� �ʿ䰡 �ִ�. 
 * �̴� �ܼ��� �Է½� �Ӹ� �ƴ϶� �����͸� ó���Ҷ����� �ʿ��ϴ�.
 * @author hangj
 *
 */
public class Solution_SWEA_6782_���ְ������ϴ������ٳ���_D5_kylie {
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
