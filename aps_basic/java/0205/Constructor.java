/*
 * constructor : ������
 * - Ư���� ������ �޼ҵ�.
 * - return type ����.
 * - �̸��� class name�� �ݵ�� ������.
 * - parameter lists ����.
 * - ���α׷� ���� �ڵ�{}�� ����.
 * - instance�� ������ ��, ���� 1ȸ �����ϴ� �ڵ带 �����ϴ� ��.
 * - instance ������ ������ �ʱ�ȭ�ϰų�, instance���� data�� �����ϴ� ��쿡 ���.
 * - constructor�� overload ��.
 */
/*
 * default constructor
 * - ���� : public ClassName(){}
 * - class ���ο� constructor�� �ϳ��� ������, JVM�� �ڵ� ����.
 * - class ���ο� constructor�� �ϳ��� ������, JVM�� ���� ����.
 * - �����ڸ� ������ ���� default ������ constructor�� �ݵ�� �߰��� �����ؾ� ��.
 */
public class Constructor {
	int testi = 777;
	public Constructor() {}
	public Constructor(int i) {//������ overload
		testi = i;
	}
	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println("con : "+con.testi);
		Constructor con2 = new Constructor(999);
		System.out.println("con2 : "+con2.testi);
	}

}
