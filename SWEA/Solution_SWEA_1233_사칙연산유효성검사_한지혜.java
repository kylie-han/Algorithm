import java.util.Scanner;

public class Solution_SWEA_1233_��Ģ������ȿ���˻�_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;// testcase�� 10��
		for (int testcase = 1; testcase <= tc; testcase++) {

			int n = Integer.parseInt(sc.nextLine());// �Էµ� ��� ��

			String[][] inData = new String[n][]; // ������ŭ �迭����

			int out = 1;

			for (int i = 0; i < inData.length; i++) {
				inData[i] = sc.nextLine().split(" ");
			}
			for (int i = 0; i < inData.length; i++) {
				if (inData[i].length > 2) {
					if (Character.isDigit(inData[i][1].charAt(0))) {
						out = 0;
						break;
					}
				} else if (!Character.isDigit(inData[i][1].charAt(0))) {
					out = 0;
					break;
				} 
			}
			System.out.println("#" + testcase + " " + out);
		}
	}// end of main
}// end of class
