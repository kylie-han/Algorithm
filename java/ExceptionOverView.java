import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AutoClose implements AutoCloseable{
	FileReader fr;
	@Override
	public void close() throws Exception {
		System.out.println("자동 자원 해제...");
		fr.close();
	}
	
}
public class ExceptionOverView {
	public static void main(String[] args) throws Exception {
						//포위망
		try(AutoClose ac = new AutoClose()) {	//try(try catch 수행한 후에 선언된 객체의 close메소드를 수행해준다.)
						//원하는 동작을 실행하는데
			FileInputStream fis = new FileInputStream("C:/hello.txt");
			System.out.println("출력??");	// 파일시스템에서 익셉션에러가 나서 catch가 수행되어 출력이 되지 않는다.
						//hello파일을 읽어오고 싶다..................................................................(수정)
			System.out.println(fis.read());
						//만약 exception error가 발생하면 catch가 체크해서
		} catch (FileNotFoundException e) {
						//에러가 발생되었음을 알려준다.
			System.out.println("파일 없죠~");
//			e.printStackTrace(); // exception 추적로그 
						//catch문 사용시에 FileNotFoundException extends IOException이므로 
						//	subclass를 위로, superclass를 아래로 위치시켜야 한다.
		} catch (IOException e) {
			System.out.println("ioexception err");
//			e.printStackTrace(); // exception 추적로그 
						//finally : 예외 발생 여부와 관계없이 항상 수행되는 코드
						//	try문 하나에 아예 없거나 하나만 만들 수 있음.
		} finally {
			System.out.println("끝!!");			
		}
//		예외상황을 예측, 대응방법 제시를 요구(Add throw Exception)
//		System.out.println(9/0);
	}
}
