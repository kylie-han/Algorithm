import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * File : 하나의 파일 또는 디렉토리를 지정.
 */
public class IO2File {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
//			System.out.println(new File(".").getCanonicalPath());
//			System.out.println(new File(".").getCanonicalPath()+"\\src\\filetest.txt");
			File file = new File(new File(".").getCanonicalPath()+"\\src\\filetest.txt");
			fis = new FileInputStream(file);
			int i = 0;
			i = fis.read();
			while(i != -1) {//-1:EOF:end of file.
				System.out.print((char)i);
				i = fis.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}//main

}
