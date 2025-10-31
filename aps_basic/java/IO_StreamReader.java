import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO_StreamReader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			File file = new File(new File(".").getCanonicalPath()+"\\src\\fileTest.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\fileTest3.txt");
			
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			fos = new FileOutputStream(outFile);
			osw = new OutputStreamWriter(fos);
			
			int readInt = 0;
			while ((readInt = isr.read()) != -1) {
				System.out.print((char)readInt);
				osw.write(readInt);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			isr.close();
			fis.close();
			osw.close();
			fos.close();
		}
	}
}
