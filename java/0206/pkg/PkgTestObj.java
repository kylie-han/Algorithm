package pkg;
/*
 * package : java 파일과 class 파일의 위치를 지정하는 표현.
 * - 상위 폴더에서 하위 폴더로 .을 통해 접근함.
 * 예) test.pkg : test 폴더 밑에 pkg 라는 폴더를 현재 java 파일과 class 파일의 위치로 지정.
 * - 하나의 파일에는 하나의 package 선언만이 가능.
 * - 일반적으로 소문자로 표현.
 * - 컴파일 : javac -d . PkgTestObj.java (*.java)
 */
public class PkgTestObj {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String toString() {
		return "message : "+message;
	}
	public void print() {
		System.out.println("message : "+message);
	}
}
