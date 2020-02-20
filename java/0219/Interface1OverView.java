/*
 * interface
 * - class ���� ��ſ� interface ������ ���.
 * - Ư���� ������ class.
 * - implements ���� ����� ���� �� ����.
 * - ��� ���� ����.
 * - abstract �޼ҵ常 ���� ����.
 * - ��ü ���� �Ұ�.
 * ��� ����.
 * - ��ӹ޾� ���� �ض�! - ����.
 * - ��ӹ޴� class���� �̷� ���¸� ���߾�� �Ѵ�! - ���̵�.(����)
 */
interface InterfaceTest {//����� abstract �޼ҵ� ���� ����.
	int intVar = 777;//�ڵ����� public static final ����.
	static int staticIntVar = 888;
	final int finalIntVar = 999;
	void normalMethod();//�ڵ����� public abstract ����.
	//void normalMethod2() {}//error - �ڵ����� public abstract ����.
}
public class Interface1OverView {

	public static void main(String[] args) {
		//InterfaceTest it = new InterfaceTest();//error - ��ü ���� �Ұ�.
		//InterfaceTest.intVar = 111;//error - ���.
		System.out.println(InterfaceTest.intVar);
		System.out.println(InterfaceTest.staticIntVar);
		System.out.println(InterfaceTest.finalIntVar);
	}

}
