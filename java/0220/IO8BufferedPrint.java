import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * BufferedReader : 한 줄 읽기.
 * PrintWriter : 한 줄 쓰기.
 */
public class IO8BufferedPrint {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			File file = new File(new File(".").getCanonicalPath()+"\\src\\filetest.txt");
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\filetest2.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			pw = new PrintWriter(outFile);
			String tmpStr = null;
			while( (tmpStr = br.readLine()) != null ) {
				System.out.println(tmpStr);
				pw.println(tmpStr);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
