import java.util.Scanner;

class MyException extends Exception{
	MyException() {
		super("message...");
	}
}
class MyIDException extends Exception{
	public MyIDException() {
		System.out.println("���̵� ����...");
	}
}
class MyPwdException extends Exception{
	public MyPwdException() {
		System.out.println("��й�ȣ ����...");
	}
}
class MyLoginException extends Exception{
	public MyLoginException() {
		System.out.println("�α��� �Ϸ�...!");
	}
}
public class UserDefinedException {
	static String id = "ssafy";
	static String pwd = "803";
	
	public static void main(String[] args) throws MyException {
//		throw new MyException();
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pwd : ");
		String pwd = sc.next();
		try {
			idPwdCheck(id, pwd);
		} catch (MyIDException | MyPwdException | MyLoginException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
	private static void idPwdCheck(String inId, String inPwd) throws MyIDException, MyPwdException, MyLoginException {
		if (!inId.equals(id)) {
			//���̵� �����ϴ�
			throw new MyIDException();
		} else if (!inPwd.equals(pwd)) {
			//�н����尡 ���� �ʽ��ϴ�.
			throw new MyPwdException();
		}else {
			//�α���
			throw new MyLoginException();
		}
	}
}
