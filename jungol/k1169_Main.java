import java.util.Scanner;

public class k1169_Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//�ֻ��� ���� Ƚ��
		int m = sc.nextInt();//1or2or3
		int[] arr = new int[n+1];//�������°�����
		switch (m) {
		case 1:
			m1(n,arr,1);
			break;
		case 2:
			m2(n,arr,1);
			break;
		case 3:
			m3(n,arr,1);
			break;
		default:
			break;
		}
		sc.close();
	}//end of main
	public static void m1(int num, int[] a,int index) {//num : �Ѿ�� ����, a : ���� ������ �迭, index : �迭�� ������
		if (num<=0) {	//��� �ߴܽ� ���
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {	//�迭 a�� 0�������� �ϳ��� ä��
			for (int i = 1; i <= 6; i++) {
				a[index] = i;
				m1(num-1,a,index+1);//1ȸ ������ num(�ֻ��� ������ ��)���̰� index(�迭�� ������) ����
			}
		}
	}//end of m1
	public static void m2(int num, int[] a,int index) {//�ߺ����� �ʴ� ���� ���
		if (num<=0) {//���
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			for (int i = 1; i <= 6; i++) {
				if(a[index-1]<=i) {// ���� ������ �ݺ����� �������� �տ� ���� ���麸�� ũ�ų� ���ƾ���
					a[index] = i;
					m2(num-1,a,index+1);					
				}
			}
		}
	}//end of m2
	public static void m3(int num, int[] a,int index) {// �ٸ� ������ ����
		if (num<=0) {//���
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
		} else {
			boolean skip = false;//�ǳʶٴ� ���� �˷��ִ� flag
			for (int i = 1; i <= 6; i++) {
				for (int j = 0; j < index; j++) {
					if(i==a[j]) skip = true;//���� ���ڵ��� ���� ���ڰ� ������ skip
				}
				if(skip) {//�ǳʶ۶�skip�÷��״� �ٽ� false�� 
					skip = false;
					continue;
				}else {//�������� ����Լ��� �迭�� ��
					a[index] = i;
					m3(num-1,a,index+1);					
				}
			}
		}
	}//end of m3

}//end of class