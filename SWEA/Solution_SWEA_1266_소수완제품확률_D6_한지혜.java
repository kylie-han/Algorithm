import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1266_�Ҽ�����ǰȮ��_D6_������ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] decimal = { 2, 3, 5, 7, 11, 13, 17 };// 18������ �Ҽ���
		int[] com = com(18);	// ������ ������ ���ϴ� �޼ҵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double pA = Integer.parseInt(st.nextToken()) / 100.0; // 80->0.8
			double pB = Integer.parseInt(st.nextToken()) / 100.0; // 90->0.9
			/////////// �Է�///////////////
			double pASum = 0.0; // A�� ���� ������ �Ҽ��� Ȯ�� (���)
			double pBSum = 0.0; // B�� ���� ������ �Ҽ��� Ȯ�� (���)
			for (int i = 0; i < decimal.length; i++) {
				double pAtest = com[decimal[i]]; // 18Cj
				double pBtest = com[decimal[i]];
				// pAtest = 0.8^j * (1-0.8)^j * (18 C j)
				for (int j = 0; j < decimal[i]; j++) {
					pAtest *= pA; // 0.8^j
					pBtest *= pB; // 0.9^j
				}
				for (int j = decimal[i]; j < 18; j++) {
					pAtest *= (1 - pA); // (1-0.8)^j
					pBtest *= (1 - pB); // (1-0.9)^j
				}
				pASum += pAtest;
				pBSum += pBtest;	
			}// A�� �Ҽ��� ���� Ȯ�� + B�� �Ҽ��� ���� Ȯ�� - A��B�� �� �Ҽ��� ����Ȯ��
			System.out.printf("#%d %.6f\n", t, pASum+pBSum-pASum*pBSum);
		} // end of for tc
	}// end of main
	/** ������ ������ ���ϴ� �޼ҵ� 
	 * i+1 �� �迭�� �����ϸ� i�߿� x���� �����ϴ� ������ ������ �� ���ִ�.*/
	public static int[] com(int i) {
		int[][] arr = new int[i + 2][i + 2];
		for (int k = 0; k < arr.length; k++) {
			arr[k][0] = 1;
			for (int l = 1; l < k; l++) {
				arr[k][l] = arr[k - 1][l - 1] + arr[k - 1][l];
			}
		}
		return arr[i+1];
	}
}// end of class
