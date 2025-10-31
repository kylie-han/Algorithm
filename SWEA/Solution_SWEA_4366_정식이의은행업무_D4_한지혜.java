import java.util.Scanner;

public class Solution_SWEA_4366_정식이의은행업무_D4_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			// String으로 입력 받아 
			String B = sc.next();
			String T = sc.next();
			// char형 배열로 바꿔줌
			char[] biArr = B.toCharArray();
			char[] triArr = T.toCharArray();
			// 각 자리의 값이 변할 수 있는 값을 구해서
			double[] value = new double[biArr.length + triArr.length*2];
			int idx = 0;
			for (int i = 0; i < biArr.length; i++) {
				// 수정해서 사용할 배열도 하나 만들어주고
				char[] biArrClone = biArr.clone();
				if (biArr[i] == '1') {
					biArrClone[i] = '0';
				}else {
					biArrClone[i] = '1';
				}
				// 결과 배열에 넣고 같은 값이 있으면 출력
				value[idx++] = binary(biArrClone);
			}
			for (int i = 0; i < triArr.length; i++) {
				// 수정해서 사용할 배열도 하나 만들어주고
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
				// 결과 배열에 넣고 같은 값이 있으면 출력
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
