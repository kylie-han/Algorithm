import java.util.Scanner;

public class SWEA_Solution_1859_�鸸����������Ʈ_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int inNum = sc.nextInt();
			int[] a = new int[inNum+1];
			for (int i = 0; i < a.length-1; i++) {
				a[i] = sc.nextInt();
			}//�Է� �迭�� ����
			long max = a[inNum-1];
			long sum = 0;
			for (int i = inNum-1; i >= 0; i--) {
				if(a[i]>=max) max = a[i];
				else sum += max-a[i];
			}//�����Ʈ
//			int flag = 1;
//			for (int i = 0; i < a.length-1; i++) {
//				if(a[i]==a[i+1]) flag++;
//				else if(a[i]>a[i+1])flag = 1;
//				else if(a[i]<a[i+1]) {
//					sum += (a[i+1]-a[i])*flag;
//					flag++;
//				}
//			}//�����Ʈ
			System.out.printf("#%d %d\n",testCase,sum);
		}//tc�ϳ��� �ѹ��� ����
	}//end of main
}//end of class
