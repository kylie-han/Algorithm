import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
 * Exception 처리 방법.
 * - Exception 발생이 가능한 코드에 포위망(try) 구축.
 * - 발생한 Exception을 처리할 수 있는 코드 블럭(catch) 제공.
 * - catch(Exception 객체를 받음) -> {} 수행.
 * - catch 발생 가능한 Exception 객체의 수만큼 선언 가능.
 * - try ~ catch 항상 함께 선언. (하나의 try에 여러 catch 선언 가능.)
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
			System.out.println("FileNotFoundException 처리 로직.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException 처리 로직.");
		} catch (NullPointerException | ArithmeticException e){
			System.out.println("NullPointerException | ArithmeticException 처리 로직.");
		} catch (NumberFormatException | ClassCastException e){
			System.out.println("NumberFormatException | ClassCastException 처리 로직.");
		}
	}

}
