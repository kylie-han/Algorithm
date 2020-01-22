
public class Z06_Permutation {
	public static void main(String[] args) {
		int[] arr = {3,7,9,};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) continue;
				for (int k = 0; k < 3; k++) {
					if (j == k || i == k) continue;
//					System.out.println(i+","+j+","+k);	//int형 이하의 자료형(byte,short,char,int)의 이항연산시 int형으로 자동 변환된다.
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
	}
}
