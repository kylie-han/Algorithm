import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try~catch ���� ����. : Exception ��ӿ� ����!!!
 * FileNotFoundException -> IOException -> Exception
 * - IOException e = new FileNotFoundException();
 * - ����, catch�� ��� �ÿ�, sub class�� ����, super class�� �Ʒ��� ��ġ!!!
 */
public class Exception3Warning {

	public static void main(String[] args) {
		//IOException e = new FileNotFoundException();
		try {
			FileInputStream fis = new FileInputStream("C:/neverfind.txt");
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();//Exception ���� �α� ���.
		} catch (IOException e) {
			System.out.println("����� ���� �Դϴ�. �Է� ��ü�� Ȯ���ϼ���.");
			e.printStackTrace();
		}

	}

}




