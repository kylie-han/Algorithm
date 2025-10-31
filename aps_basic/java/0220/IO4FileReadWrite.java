import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * FileReader, FileWriter : 16bit node.
 */
public class IO4FileReadWrite {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File file = new File(new File(".").getCanonicalPath()+"\\src\\filetest333.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\filetest2.txt");

			fr = new FileReader(file);
			fw = new FileWriter(outFile);
			int readInt = 0;
			while(	(readInt = fr.read())	!=	-1	) {
				System.out.print((char)readInt);
				fw.write(readInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//main

}
