import java.io.FileReader;

/*
 * try 문에서 자원을 자동 해제하는 방법. 자바7부터 사용!!!
 * - implements AutoCloseable -> close() override
 */
class AutoCloseTest implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("자동 자원 해제...");
	}
}
class AutoCloseTest2 implements AutoCloseable {
	FileReader fr;
	@Override
	public void close() throws Exception {
		System.out.println("자동 자원 해제2...");
		//fr.close();
	}
}
public class Exception5Resources {
	public static void main(String[] args) {
		try(AutoCloseTest2 at = new AutoCloseTest2()) {
		} catch(Exception e) {
			System.out.println("catch Exception...");
		}
		System.out.println("=====================");
		try(AutoCloseTest at = new AutoCloseTest()) {
			throw new NullPointerException();
		} catch(Exception e) {
			System.out.println("catch Exception...");
		}
		System.out.println("=====================");
		try(AutoCloseTest at = new AutoCloseTest()) {
		} catch(Exception e) {
			System.out.println("catch Exception...");
		}

	}//main

}


