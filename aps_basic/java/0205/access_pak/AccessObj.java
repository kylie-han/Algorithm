package access_pak;
/*
 * Access Modifier : ���� ������.
 * - public : ������ ���� ����. ���� ���� ����.
 * - protected :���� ���� ���� + ��ӿ��� ���� ����.
 * - default : ���� ���� ���ο����� ����.
 * - private : ����  class ���ο����� ���� ����.
 */
public class AccessObj {
	public String puStr = "public value";
	protected String proStr = "protected value";
	String deStr = "default value";
	private String priStr = "private value";
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		System.out.println(obj.proStr);
		System.out.println(obj.deStr);
		System.out.println(obj.priStr);
	}
}





