/*
 * throw : Exception �߻� ��Ű�� ǥ��.
 * throws : Exception�� �߻��� �ڵ带 ȣ���� �޼ҵ忡�� Exception ó���� ���ѱ�� ǥ��.
 */
public class Exception6Throws {

	public void throwTest() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Exception �߻� �������� ó��");
		}
	}
	public void throwsTest() throws NullPointerException {
		throw new NullPointerException();
	}
	//idCheck �޼ҵ带 ȣ���� ������, NullPointerException�� ���� �־ƶ�.
	public void idCheck(String id) throws NullPointerException {
		if(!id.equals("SSAFY")) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		Exception6Throws e6 = new Exception6Throws();
		e6.throwTest();
		try {
			e6.throwsTest();
		} catch (NullPointerException e) {
			System.out.println("throws�� ���� Exception�� �Ѱ� �޾� ó��.");
		}
		System.out.println("Why???==============");
		try {
			e6.idCheck("ssafy");
		} catch (NullPointerException e) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}
	}

}












