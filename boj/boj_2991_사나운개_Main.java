import java.util.Scanner;

public class boj_2991_�糪�_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//a�е��� ������
		int b = sc.nextInt();//b�е��� ��
		int c = sc.nextInt();//�ٸ� �� c�е��� ������
		int d = sc.nextInt();//�ٸ� �� d�е��� ��
		int p = sc.nextInt();//��ü���� �����ð�
		int m = sc.nextInt();//������޿��� �����ð�
		int n = sc.nextInt();//�Ź���޿��� �����ð�
		int[] arr = {p,m,n};
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			if(arr[i]%(a+b) <= a && arr[i]%(a+b)!=0) cnt++;
			if(arr[i]%(c+d) <= c && arr[i]%(c+d)!=0) cnt++;
			System.out.println(cnt);
		}
		sc.close();
	}//end of main
}//end of class
