import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
 * Exception ó�� ���.
 * - Exception �߻��� ������ �ڵ忡 ������(try) ����.
 * - �߻��� Exception�� ó���� �� �ִ� �ڵ� ��(catch) ����.
 * - catch(Exception ��ü�� ����) -> {} ����.
 * - catch �߻� ������ Exception ��ü�� ����ŭ ���� ����.
 * - try ~ catch �׻� �Բ� ����. (�ϳ��� try�� ���� catch ���� ����.)
 */
public class Exception2TryCatch {

	public static void main(String[] args) {

		try{
			FileInputStream fis = new FileInputStream("C:/neverfind.txt");
			args[0] = "hi";//ArrayIndexOutOfBoundsException
			String s = null;
			System.out.println(s.length());//NullPointerException
			System.out.println(999/0);//ArithmeticException
			System.out.println(Integer.parseInt("1 11"));//NumberFormatException
			ArrayList list = new ArrayList();
			list.add(new Exception1OverView());
			ArrayList list2 = (ArrayList) list.get(0);//ClassCastException
		} catch (FileNotFoundException e){
			System.out.println("FileNotFoundException ó�� ����.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException ó�� ����.");
		} catch (NullPointerException | ArithmeticException e){
			System.out.println("NullPointerException | ArithmeticException ó�� ����.");
		} catch (NumberFormatException | ClassCastException e){
			System.out.println("NumberFormatException | ClassCastException ó�� ����.");
		}
	}

}
