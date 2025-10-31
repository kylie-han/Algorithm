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
	//super class�� throws�� ����� IOException�� sub class�� ����.
	public void throwsMethod() throws FileNotFoundException {}//ok

	//super class�� throws�� ����� IOException�� super class�� �Ұ���.
	//public void throwsMethod() throws Exception {}//error

	//public IOException returnMethod() { return new IOException(); }//ok
	//super class�� ���� Ÿ�Կ� ����� IOException�� sub class�� ����.
	public FileNotFoundException returnMethod() { return new FileNotFoundException(); }//ok
	//super class�� ���� Ÿ�Կ� ����� IOException�� super class�� �Ұ���.
	//public Exception returnMethod() { return new Exception(); }//error
	//public void returnMethod() { }//error - override �ƴ�.
}
public class Exception7Override {

	public static void main(String[] args) {
		System.out.println("Exception Override�� ���� ����.");
	}

}
