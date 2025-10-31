import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOOverView {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileReader fr = null;
		FileWriter fw = null;
		try {
//			System.out.println(new File(".").getCanonicalPath());//C:\SSAFY\work_java\02_Practice
			
			File file = new File(new File(".").getCanonicalPath()+"\\src\\fileTest.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\fileTest2.txt");
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(outFile);
			fr = new FileReader(file);
			fw = new FileWriter(outFile);
			
			int readInt = 0;
			while ((readInt = fr.read()) != -1) {	//	-1 : EOF(end of file)
				System.out.print((char)readInt);
				fw.write(readInt);
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
