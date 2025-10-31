import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODataIO {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\data.dat");
			
			fos = new FileOutputStream(outFile);
			dos = new DataOutputStream(fos);
			dos.writeInt(12341236);
			
			fis = new FileInputStream(outFile);
			dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
