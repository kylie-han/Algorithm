import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AutoClose implements AutoCloseable{
	FileReader fr;
	@Override
	public void close() throws Exception {
		System.out.println("�ڵ� �ڿ� ����...");
		fr.close();
	}
	
}
public class ExceptionOverView {
	public static void main(String[] args) throws Exception {
						//������
		try(AutoClose ac = new AutoClose()) {	//try(try catch ������ �Ŀ� ����� ��ü�� close�޼ҵ带 �������ش�.)
						//���ϴ� ������ �����ϴµ�
			FileInputStream fis = new FileInputStream("C:/hello.txt");
			System.out.println("���??");	// ���Ͻý��ۿ��� �ͼ��ǿ����� ���� catch�� ����Ǿ� ����� ���� �ʴ´�.
						//hello������ �о���� �ʹ�..................................................................(����)
			System.out.println(fis.read());
						//���� exception error�� �߻��ϸ� catch�� üũ�ؼ�
		} catch (FileNotFoundException e) {
						//������ �߻��Ǿ����� �˷��ش�.
			System.out.println("���� ����~");
//			e.printStackTrace(); // exception �����α� 
						//catch�� ���ÿ� FileNotFoundException extends IOException�̹Ƿ� 
						//	subclass�� ����, superclass�� �Ʒ��� ��ġ���Ѿ� �Ѵ�.
		} catch (IOException e) {
			System.out.println("ioexception err");
//			e.printStackTrace(); // exception �����α� 
						//finally : ���� �߻� ���ο� ������� �׻� ����Ǵ� �ڵ�
						//	try�� �ϳ��� �ƿ� ���ų� �ϳ��� ���� �� ����.
		} finally {
			System.out.println("��!!");			
		}
//		���ܻ�Ȳ�� ����, ������� ���ø� �䱸(Add throw Exception)
//		System.out.println(9/0);
	}
}
