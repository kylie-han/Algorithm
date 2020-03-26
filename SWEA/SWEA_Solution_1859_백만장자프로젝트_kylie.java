import java.util.Scanner;

public class SWEA_Solution_1859_백만장자프로젝트_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int inNum = sc.nextInt();
			int[] a = new int[inNum+1];
			for (int i = 0; i < a.length-1; i++) {
				a[i] = sc.nextInt();
			}//입력 배열에 저장
			long max = a[inNum-1];
			long sum = 0;
			for (int i = inNum-1; i >= 0; i--) {
				if(a[i]>=max) max = a[i];
				else sum += max-a[i];
			}//계산파트
//			int flag = 1;
//			for (int i = 0; i < a.length-1; i++) {
//				if(a[i]==a[i+1]) flag++;
//				else if(a[i]>a[i+1])flag = 1;
//				else if(a[i]<a[i+1]) {
//					sum += (a[i+1]-a[i])*flag;
//					flag++;
//				}
//			}//계산파트
			System.out.printf("#%d %d\n",testCase,sum);
		}//tc하나당 한번씩 실행
	}//end of main
}//end of class
