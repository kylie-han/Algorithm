import java.util.Scanner;

public class ����_Main_1175_�ֻ���������2_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//�ֻ��� ������ Ƚ��
		int m = sc.nextInt();//���ϴ� �ֻ��� ���� ��
		int[] dice = {1,2,3,4,5,6};//�ֻ����� ��
		int[] arr = new int[n+1];
		dice(n,m,arr,1);
	}//end of main
	public static void dice(int num,int sum, int[] a,int index) {
		if (num<=0) {//���
			int x=0;
			for (int i = 1; i < a.length; i++) {
				x+=a[i];
			}
			if(x == sum) {
				for (int i = 1; i < a.length; i++) {
					System.out.print(a[i]+" ");
				}System.out.println();
			}
		} else {	//�迭 a�� 0�������� �ϳ��� ä��
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				dice(num-1,sum,a,index+1);//1ȸ ������ num(�ֻ��� ������ ��)���̰� index(�迭�� ������) ����
			}
		}
	}//end of dice
}//end of class
