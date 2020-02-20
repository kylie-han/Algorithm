import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try~catch 주의 사항. : Exception 상속에 주의!!!
 * FileNotFoundException -> IOException -> Exception
 * - IOException e = new FileNotFoundException();
 * - 따라서, catch문 사용 시에, sub class를 위로, super class를 아래로 배치!!!
 */
public class Exception3Warning {

	public static void main(String[] args) {
		//IOException e = new FileNotFoundException();
		try {
			FileInputStream fis = new FileInputStream("C:/neverfind.txt");
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();//Exception 추적 로그 출력.
		} catch (IOException e) {
			System.out.println("입출력 오류 입니다. 입력 개체를 확인하세요.");
			e.printStackTrace();
		}

	}

}




