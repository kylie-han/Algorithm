import java.util.Scanner;

public class k539_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�Է¹޴� �޼ҵ�
		int a = 0;
		int sum = 0;//����
		int cnt = 0;//����� ���ϱ� ���� ���� ����
		while(a<100) {//100�� ��� �� ������ �ݺ�
			a = sc.nextInt();//
			sum += a;
			cnt++;
		}
		System.out.println(sum);
		if(cnt != 0){
			System.out.println(String.format("%.1f", ((float)sum/cnt)));//14.15�� 1°���� �ݿø��ϱ� ���� format ���
			System.out.printf("%.1f",((float)sum/cnt));
		}
		sc.close();
	}//main
}//class
