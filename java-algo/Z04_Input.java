import java.util.Scanner;

/**
 * �ڹ��� �Է¹��
 * Scanner
 */
public class Z04_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//�Է��� �ޱ� ���ؼ� ��ü������ �ѹ� �ؾ��Ѵ�.
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();//String ����
		System.out.println(name+"�� ����̿���?");
		int age = sc.nextInt();//int ����
		System.out.println(age + "�� �Դϴ�");
		sc.close();
	}//end of main
}//end of class
