import java.io.FileInputStream;
import java.util.ArrayList;

/*
 * Java Error ����.
 * - compile error : ���� ���� -> �ڵ� �������� �ذ�.
 * - runtime error : ���� �� ����. fatal error�� exception.
 * fatal error : ������ ����. - �޸� ���� ��.
 * exception : ���� ��Ȳ. : ���α׷��Ӱ� ����ġ ���� ���� ���� ����.
 * - ���� �߿� ������ ������ �̾Ҵ�!!!
 * exception handling : ���� ��Ȳ ó��. : �̸� ���� ��Ȳ ���� + ���� ��� ����.
 * - ���� ��Ȳ �ÿ�, ���۵� ����, ��Ȳ �ȳ�, ������ ���α׷� ���� �� ó��.
 * - �α׸� ����, ���Ŀ� ���� �м��� �����ϵ��� ó��.
 * Exception ���� ����.
 * - jvm�� ���α׷��� �����ϹǷ�, ���� ���� Exception�� Ȯ����.
 * - jvm�� �߻��� Exception�� ����(Exception) ��ü�� ���� ���α׷��� ����.
 * - ���� Exception ������ �� �� ����.
 * Tip!!! Exception ��� ���� �߿�!!!
 */
public class Exception1OverView {

	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream("C:/neverfind.txt");
		//���� ��Ȳ ����. -> ���� ��� ���ø� �䱸.
		//args[0] = "hi";//ArrayIndexOutOfBoundsException
		String s = null;
		//System.out.println(s.length());//NullPointerException
		//System.out.println(999/0);//ArithmeticException
		System.out.println("111"+"222");
		System.out.println(Integer.parseInt("111")+Integer.parseInt("222"));
		//System.out.println(Integer.parseInt("1 11"));//NumberFormatException
		ArrayList list = new ArrayList();
		list.add(new Exception1OverView());
		ArrayList list2 = (ArrayList) list.get(0);//ClassCastException
	}

}





