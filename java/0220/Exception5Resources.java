import java.io.FileReader;

/*
 * try ������ �ڿ��� �ڵ� �����ϴ� ���. �ڹ�7���� ���!!!
 * - implements AutoCloseable -> close() override
 */
class AutoCloseTest implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("�ڵ� �ڿ� ����...");
	}
}
class AutoCloseTest2 implements AutoCloseable {
	FileReader fr;
	@Override
	public void close() throws Exception {
		System.out.println("�ڵ� �ڿ� ����2...");
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


