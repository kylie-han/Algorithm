import java.util.Scanner;

public class SWEA_2072_Ȧ�������ϱ�_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();//test case ����
		for (int testCase = 1; testCase <= TC; testCase++) {
			int[] a = new int[10];
			int sum = 0;
			for (int i = 0; i < 10; i++) {				
				a[i] = sc.nextInt();
				if(a[i]%2 == 1) sum += a[i]; 
			}
			System.out.println("#"+testCase+" "+sum);
		}//TN �Է°���ŭ �ݺ�
	}//end of main
}//end of class
