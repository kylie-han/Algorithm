import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO6DataInOut {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\data.dat");

			fos = new FileOutputStream(outFile);
			dos = new DataOutputStream(fos);
			dos.writeByte(127);dos.writeShort(12700);dos.writeInt(1270000);dos.writeLong(127000000L);
			dos.writeFloat(3.14F);dos.writeDouble(99.9999D);dos.writeBoolean(false);dos.writeChar('A');
			dos.writeUTF("you can write String...");

			fis = new FileInputStream(outFile);
			dis = new DataInputStream(fis);
			System.out.println(dis.readByte());System.out.println(dis.readShort());
			System.out.println(dis.readInt());System.out.println(dis.readLong());
			System.out.println(dis.readFloat());System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
