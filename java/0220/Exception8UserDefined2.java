import java.util.Scanner;
class MyIDException extends Exception {
	MyIDException(){
		super("아이디가 존재하지 않습니다.");
	}
}
class MyPWDException extends Exception {
	MyPWDException(){
		super("패스워드 오류 입니다.");
	}
}
class MyLoginOKException extends Exception {
	MyLoginOKException(){
		super("로그인 되셨습니다.");
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
			//아이디가 존재하지 않습니다.
			throw new MyIDException();
		} else if (!inPwd.equals(pwd)) {
			//패스워드 오류 입니다.
			throw new MyPWDException();
		} else {
			//로그인 되셨습니다.
			throw new MyLoginOKException();
		}
		
	}//main

}








