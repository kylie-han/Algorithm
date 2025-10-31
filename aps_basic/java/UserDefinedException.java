import java.util.Scanner;

class MyException extends Exception{
	MyException() {
		super("message...");
	}
}
class MyIDException extends Exception{
	public MyIDException() {
		System.out.println("아이디 없음...");
	}
}
class MyPwdException extends Exception{
	public MyPwdException() {
		System.out.println("비밀번호 오류...");
	}
}
class MyLoginException extends Exception{
	public MyLoginException() {
		System.out.println("로그인 완료...!");
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
			//아이디가 없습니다
			throw new MyIDException();
		} else if (!inPwd.equals(pwd)) {
			//패스워드가 맞지 않습니다.
			throw new MyPwdException();
		}else {
			//로그인
			throw new MyLoginException();
		}
	}
}
