/*
 * User Defined Exception : ���α׷��Ӱ� ������ Exception.
 * - Exception extends �޴� class �ۼ�.
 * - Exception �޼����� super �����ڸ� ���� ����. super("message");
 */
class MyException extends Exception {
	MyException(){
		super("message...???");
	}
}
public class Exception8UserDefined {

	public static void main(String[] args) throws MyException {
			throw new MyException();

	}//main

}
