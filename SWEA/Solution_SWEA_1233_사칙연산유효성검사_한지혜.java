import java.util.Scanner;

public class Solution_SWEA_1233_사칙연산유효성검사_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;// testcase는 10개
		for (int testcase = 1; testcase <= tc; testcase++) {

			int n = Integer.parseInt(sc.nextLine());// 입력될 노드 수

			String[][] inData = new String[n][]; // 노드수만큼 배열생성

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
