import java.util.Scanner;

public class Solution_SWEA_4366_���������������_D4_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			// String���� �Է� �޾� 
			String B = sc.next();
			String T = sc.next();
			// char�� �迭�� �ٲ���
			char[] biArr = B.toCharArray();
			char[] triArr = T.toCharArray();
			// �� �ڸ��� ���� ���� �� �ִ� ���� ���ؼ�
			double[] value = new double[biArr.length + triArr.length*2];
			int idx = 0;
			for (int i = 0; i < biArr.length; i++) {
				// �����ؼ� ����� �迭�� �ϳ� ������ְ�
				char[] biArrClone = biArr.clone();
				if (biArr[i] == '1') {
					biArrClone[i] = '0';
				}else {
					biArrClone[i] = '1';
				}
				// ��� �迭�� �ְ� ���� ���� ������ ���
				value[idx++] = binary(biArrClone);
			}
			for (int i = 0; i < triArr.length; i++) {
				// �����ؼ� ����� �迭�� �ϳ� ������ְ�
				char[] triArrClone = triArr.clone();
				if (triArr[i] == '2') {
					triArrClone[i] = '0';
					value[idx++] = tenary(triArrClone);
					triArrClone[i] = '1';
					value[idx++] = tenary(triArrClone);
				}else if (triArr[i] == '1') {
					triArrClone[i] = '0';
					value[idx++] = tenary(triArrClone);
					triArrClone[i] = '2';
					value[idx++] = tenary(triArrClone);
				}else {
					triArrClone[i] = '1';
					value[idx++] = tenary(triArrClone);
					triArrClone[i] = '2';
					value[idx++] = tenary(triArrClone);
				}
				// ��� �迭�� �ְ� ���� ���� ������ ���
			}
			for (int i = 0; i < value.length-1; i++) {
				for (int j = i+1; j < value.length; j++) {
					if (value[i] == value[j]) {
						System.out.printf("#%d %.0f\n",t,value[i]);
						break;
					}
				}
			}
		}
	}

	private static double binary(char[] b) {
		int Len = b.length;
		double num = 0;
		for (int i = 0; i < Len; i++) {
			num += Math.pow(2.0, i) * (b[Len-1-i]-'0');
		}
		return num;
	}
	private static double tenary(char[] t) {
		int Len = t.length;
		double num = 0;
		for (int i = 0; i < Len; i++) {
			num += Math.pow(3.0, i) * (t[Len-1-i]-'0');
		}
		return num;
	}
}
