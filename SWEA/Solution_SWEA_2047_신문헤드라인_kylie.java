import java.util.Scanner;

public class Solution_SWEA_2047_�Ź�������_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//���ڿ� �Է�
		char[] arr = str.toCharArray();//���ڹ迭�� ��ȯ
        //�ҹ��ڿ� ���� �빮�ڷ� ��ȯ�ϰ� ���
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a'&&arr[i]<='z') arr[i] -=32;
			System.out.print(arr[i]);
		}
	}//main
}//class