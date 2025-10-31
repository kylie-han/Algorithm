import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * InputStreamReader : 8bit 입력 -> 16bit 입력
 * OutputStreamWriter : 8bit 출력 -> 16bit 출력
 * - 비알파벳권 언어를 사용할 수 있도록 도와주는 class.
 */
public class IO5StreamReader {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		FileOutputStream fos = null;
		OutputStreamWriter isw = null;
		try {
			File file = new File(new File(".").getCanonicalPath()+"\\src\\filetest.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\filetest2.txt");

			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			//isr = new InputStreamReader(fis,"EUC-KR");
			fos = new FileOutputStream(outFile);
			isw = new OutputStreamWriter(fos);

			int readInt = 0;
			while((readInt = isr.read()) != -1) {
				System.out.print((char)readInt);
				isw.write(readInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
				fis.close();
				isw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//main

}
