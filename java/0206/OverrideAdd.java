import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Override Access Modifiers, Exception
 */
class AddSup {
	void access() {}
	void exception() throws IOException {}
}
class AddSub extends AddSup {
	public void access() {}
	//private void access() {}//error
	/*Override �� ��, Access Modifiers��
	 * ���� Access Modifiers ����, ������ ��ȭ�ϴ� ���� ����.
	 * ���� Access Modifiers ����, ������ ��ȭ�ϴ� ���� �Ұ���.
	 */
	void exception() throws FileNotFoundException {}
	//void exception() throws Exception {}//error
	/*Override �� ��, Exception��
	 * ���� Exception ����, ���� class�� �Ұ���.
	 * ���� Exception ����, ���� class��  ����.
	 * Exception <- IOException <- FileNotFoundException
	 */
	@Override//compiler���� override ���� �˻縦 ��û�ϴ� ǥ��.
	public String toString() {
		//�ֻ��� class�� Object�� toString() �޼ҵ带 Override �� ��.
		return "this is toString override";
	}
}
public class OverrideAdd {
	public static void main(String[] args) {
		AddSub s = new AddSub();
		System.out.println(s);
	}
}







