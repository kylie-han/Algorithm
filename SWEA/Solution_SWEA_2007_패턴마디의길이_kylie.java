import java.util.Scanner;

public class Solution_SWEA_2007_���ϸ����Ǳ���_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			String str = sc.next();
			int len = 0;
			//���̸� ó���ϴ� �κ�
			for (int i = 10; i > 0 ; i--) {//�ݺ����ڿ� �ִ���̰� 10
				if(str.substring(0, i).equals(str.substring(i,i+i))) {//10���� �ݺ��Ǵ��� üũ->9���� �ݺ��Ǵ��� üũ->...
					len = i;
					if(len>=i)len =i;//�ݺ��Ǵ� ���� ���� ª�� ���� ����
				}
			}
		System.out.println("#"+testCase+" "+len);//���
		}
	}
}
