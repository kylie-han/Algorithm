import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * FileInputStream, FileOutputStream : 8bit node.
 */
public class IO3FileInOut {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File(new File(".").getCanonicalPath()+"\\src\\filetest.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\filetest2.txt");

			fis = new FileInputStream(file);
			fos = new FileOutputStream(outFile);

			int readInt = 0;
			while(	(readInt = fis.read()) != -1	) {
				System.out.print((char)readInt);
				fos.write(readInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
