import java.util.Scanner;

public class k562_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		//입력을 배열에 저장
		int sum_o = 0;
		int cnt_o = 0;
		int sum_e = 0;
		int cnt_e = 0;
		for (int i = 0; i < 10; i++) {
			int inData = sc.nextInt();
			arr[i] = inData;
			if(i%2 == 0) {//i는 0부터 여서 ->홀수번째 체킹
				sum_o += arr[i];
				cnt_o++;
			}else {
				sum_e += arr[i];
				cnt_e++;
			}
		}
		System.out.printf("sum : %d\n",sum_e);
		System.out.printf("avg : %.1f",(float)sum_o/cnt_e);
	}//end of main
}//end of class
