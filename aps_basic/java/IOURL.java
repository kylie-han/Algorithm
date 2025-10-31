import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOURL {
	public static void main(String[] args) {
		URL url = null;
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			url = new URL("https://www.naver.com/");
			is = url.openStream();
			isr = new InputStreamReader(is,"utf-8");
			int readInt = 0;
			while ((readInt = isr.read()) != -1) {
				System.out.write(readInt);
				System.out.flush();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
