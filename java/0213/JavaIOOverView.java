import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Java IO Stream : input/output
 * - node : 끝과 끝을 연결. file <-> program : FileInputStream, FileOutputStream
 * - filter : data 이동 중에 변형.
 *          : BufferedReader, BufferedWriter, InputStreamReader, OutputStreamWriter.
 * - byte : 8bit 단위로 데이터 이동. class 이름 끝이 ~InputStream, ~OutputStream.
 * - char : 16bit 단위로 데이터 이동. class 이름 끝이 ~Reader, ~Writer.
 */
public class JavaIOOverView {

	public static void main(String[] args) throws IOException {
		//1. FileInputStream, FileOutputStream test.
//		FileInputStream fis = new FileInputStream("C:/data_english.txt");
//		//FileInputStream fis = new FileInputStream("C:/data_korean.txt");
//		FileOutputStream fos = new FileOutputStream("C:/data_english2.txt");
//		int a = 0;
//		while((a = fis.read()) != -1) {//EOF : EndOfFile.
//			System.out.println((char)a);
//			//fos.write(a);
//		}
//		fis.close();
//		fos.close();
		//2. FileReader test.
//		FileReader fr = new FileReader("C:/data_korean.txt");
//		int a = 0;
//		while((a = fr.read()) != -1) {//EOF : EndOfFile.
//			System.out.println((char)a);
//		}
//		fr.close();
		//3. FileReader, BufferedReader test.
//		FileInputStream fi = new FileInputStream("C:/data_korean.txt");
//		InputStreamReader isr = new InputStreamReader(fi, "EUC-KR");
//		BufferedReader br = new BufferedReader(isr);
//		String readLine = br.readLine();
//		while(readLine != null){
//			System.out.println(readLine);
//			readLine = br.readLine();
//		}
//		br.close();
//		isr.close();
//		fi.close();
		//4. System.in, InputStreamReader, BufferedReader test.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		isr.close();
		br.close();
	}

}
