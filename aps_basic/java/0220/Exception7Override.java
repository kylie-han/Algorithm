import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileNotFoundException -> IOException -> Exception
 */
class OverrideExceptionSuper {
	public void throwsMethod() throws IOException {}
	public IOException returnMethod() { return new IOException(); }
}
class OverrideExceptionChild extends OverrideExceptionSuper {
	//public void throwsMethod() throws IOException {}//ok
	//public void throwsMethod() {}//ok
	//super class의 throws에 선언된 IOException의 sub class는 가능.
	public void throwsMethod() throws FileNotFoundException {}//ok

	//super class의 throws에 선언된 IOException의 super class는 불가능.
	//public void throwsMethod() throws Exception {}//error

	//public IOException returnMethod() { return new IOException(); }//ok
	//super class의 리턴 타입에 선언된 IOException의 sub class는 가능.
	public FileNotFoundException returnMethod() { return new FileNotFoundException(); }//ok
	//super class의 리턴 타입에 선언된 IOException의 super class는 불가능.
	//public Exception returnMethod() { return new Exception(); }//error
	//public void returnMethod() { }//error - override 아님.
}
public class Exception7Override {

	public static void main(String[] args) {
		System.out.println("Exception Override의 주의 사항.");
	}

}
