import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO5InPutStream2 {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			int readInt = 0;
			while((readInt = br.read()) != 0) {
				System.out.println((char)readInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
