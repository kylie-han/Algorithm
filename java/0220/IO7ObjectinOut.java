import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * VO : Value Object
 * DTO : Data Transfer Object
 */
class OOTestVO implements Serializable {
	private String name;
	private String telNo;
	OOTestVO(String name, String telNo){
		this.name = name;
		this.telNo = telNo;
	}
	@Override
	public String toString() {
		return this.name+" = "+this.telNo;
	}
}
public class IO7ObjectinOut {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\object.obj");
			fos = new FileOutputStream(outFile);
			oos = new ObjectOutputStream(fos);
			fis = new FileInputStream(outFile);
			ois = new ObjectInputStream(fis);
			oos.writeObject(new OOTestVO("강호동", "010-9999-8888"));
			oos.writeObject(new OOTestVO("유재석", "010-1111-2222"));

			OOTestVO tmpVO2 = (OOTestVO) ois.readObject();
			while(	tmpVO2 != null	) {
				try {
					System.out.println(tmpVO2);//EOFException - end of file.
					tmpVO2 = (OOTestVO) ois.readObject();
				} catch (EOFException e) {
					break;
				}
			}
//			OOTestVO tmpVO = (OOTestVO) ois.readObject();
//			System.out.println(tmpVO);
//			tmpVO = (OOTestVO) ois.readObject();
//			System.out.println(tmpVO);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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









