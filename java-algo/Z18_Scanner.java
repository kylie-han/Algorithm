import java.util.Scanner;

public class Z18_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� �Է� - ���ۿ� �����Է½ñ����� �����͸� ��������, �������������� ���� �Է����� ���
//		sc.nextLine();
		
		//�⺻�� Ÿ�԰迭 - ���ϴ� ���������� �����͸� �������� �������� ����� ���ϴ� �����͸� �Է����� ���
//		sc.next();
//		sc.nextInt();
//		sc.nextDouble();
//		sc.nextBoolean();

		System.out.println("�� ���̴�?");
		String sss = sc.nextLine();
		int age = Integer.parseInt(sss);
		System.out.println(age + "��");
		
//		sc.nextLine();
		
		System.out.println("�̸��� ����");
		String name = sc.nextLine();
		System.out.println(name + "�ȳ�");
		sc.close();
	}//end of main
}//end of class
