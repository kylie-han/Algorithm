/*
 * User Defined Exception : 프로그래머가 정의한 Exception.
 * - Exception extends 받는 class 작성.
 * - Exception 메세지는 super 생성자를 통해 만듬. super("message");
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
