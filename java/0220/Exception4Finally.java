import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * finally : try ������ ��ó�� ���.
 * - ���� �߻� ���ο� �����ϰ�, �׻� �ݵ�� ����Ǵ� �ڵ�.
 * - try ���� �ϳ��� finally ���� �ϳ�!!!
 */
public class Exception4Finally {

	public static void main(String[] args) {
		//step1.
		try {
			System.out.println("No!!! Exception!!!");
		} catch(Exception e) {
			System.out.println("No!!! Print!!!");
		} finally {
			System.out.println("Always!!! Print!!!");
		}
		System.out.println("========================");
		//step2.
		try {
			System.out.println("Exception!!!");
			System.out.println(999/0);
		} catch(Exception e) {
			System.out.println("catch!!!");
		} finally {
			System.out.println("Always!!! Print!!!");
		}
		System.out.println("========================");
		//step3.
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/neverfind.txt");
			fis.read();
		}catch(IOException e) {
			System.out.println("������ �߻� �ϴ� ���ϴ� finally ����.");
		} finally {
			try {
				fis.close();//"C:/neverfind.txt" ��������, fis�� null.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

