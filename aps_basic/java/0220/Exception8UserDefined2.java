import java.util.Scanner;
class MyIDException extends Exception {
	MyIDException(){
		super("���̵� �������� �ʽ��ϴ�.");
	}
}
class MyPWDException extends Exception {
	MyPWDException(){
		super("�н����� ���� �Դϴ�.");
	}
}
class MyLoginOKException extends Exception {
	MyLoginOKException(){
		super("�α��� �Ǽ̽��ϴ�.");
	}
}
public class Exception8UserDefined2 {
	static String id="SSAFY";
	static String pwd="803";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		String id = scan.next();
		System.out.print("pwd : ");
		String pwd = scan.next();
			try {
				idPwdCheck(id,pwd);
			} catch (MyIDException | MyPWDException | MyLoginOKException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
	}
	private static void idPwdCheck(String inId, String inPwd)
			throws MyIDException, MyPWDException, MyLoginOKException {
		if(!inId.equals(id)) {
			//���̵� �������� �ʽ��ϴ�.
			throw new MyIDException();
		} else if (!inPwd.equals(pwd)) {
			//�н����� ���� �Դϴ�.
			throw new MyPWDException();
		} else {
			//�α��� �Ǽ̽��ϴ�.
			throw new MyLoginOKException();
		}
		
	}//main

}








