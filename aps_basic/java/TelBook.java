import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class TestVO implements Serializable{
	private String name;
	private String telNo;
	public TestVO() {
	}
	public TestVO(String name, String telNo) {
		super();
		this.name = name;
		this.telNo = telNo;
	}
	@Override
	public String toString() {
		return "name=" + name + ", telNo=" + telNo;
	}
}

public class TelBook {
	public static void main(String[] args) {
		ArrayList<TestVO> book = new ArrayList<TestVO>();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\tel_book.obj");
			fos = new FileOutputStream(outFile);
			oos = new ObjectOutputStream(fos);
			fis = new FileInputStream(outFile);
			ois = new ObjectInputStream(fis);
			oos.writeObject(new TestVO("±è¼¼Àº","010-4112-1551"));
			TestVO tempVO = (TestVO) ois.readObject();
			
			while (tempVO != null) {
				try {
					System.out.println(tempVO);
					tempVO = (TestVO) ois.readObject();
				} catch (EOFException e) {
					break;
				}
			}
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				fos.close();
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
