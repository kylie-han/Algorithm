import java.util.Arrays;
import java.util.Scanner;

//n개의 입력된 데이터를 내림차순으로 정렬한다.
public class k563_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inData = new int[11];
		for (int i = 0; i < inData.length-1; i++) {
			inData[i] = sc.nextInt();
		}
		for (int i = 0; i < inData.length-1; i++) {
			for (int j = i+1; j < inData.length-1; j++) {
				if(inData[i] < inData[j]) {
					int tmp  = inData[i];
					inData[i] = inData[j];
					inData[j] = tmp;
				}
			}
		}
		for (int i = 0; i < inData.length-1; i++) {
			System.out.print(inData[i]+ " ");
		}
	}
}
