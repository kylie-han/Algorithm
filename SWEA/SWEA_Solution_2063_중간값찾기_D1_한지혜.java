import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_2063_중간값찾기_D1_한지혜 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TN = sc.nextInt();	//들어오는 수의 갯수
		int[] arr = new int[TN];//받은 갯수만큼의 배열 선언, 배열의 기본값은 0으로 채워져있다.
		//입력받은 값을 배열에 넣고
		for (int i = 0; i < TN; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		//그 배열을 정렬한다
		Arrays.sort(arr);
		//정렬의 중간값출력
		System.out.println(arr[TN/2]);
	}
}
