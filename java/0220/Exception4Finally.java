import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * finally : try 문장의 뒷처리 담당.
 * - 예외 발생 여부와 무관하게, 항상 반드시 수행되는 코드.
 * - try 문장 하나에 finally 문장 하나!!!
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
			System.out.println("에러가 발생 하던 안하던 finally 수행.");
		} finally {
			try {
				fis.close();//"C:/neverfind.txt" 없음으로, fis는 null.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

