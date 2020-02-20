import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IO9URL {

	public static void main(String[] args) {
		URL url = null;
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			url = new URL("https://www.naver.com/");
			is = url.openStream();
			isr = new InputStreamReader(is,"UTF-8");
			int readInt = 0;
			while( (readInt = is.read()) != -1 ) {
				System.out.write(readInt);
				System.out.flush();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
