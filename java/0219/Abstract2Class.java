/*
 * abstract class
 * - instance ������ �ȵǴ� ���� �����ϰ��, �Ϲ� class�� �ٸ� �� ����.
 */
abstract class AbstractExample {
	int normalMemberVar = 777;//�������� ���� ���� ����.
	static int staticNormalMemberVar = 999;
	final double CIRCLE_RATIO = 3.14;
	public void normalMethod() {}//�������� �޼ҵ� ���� ����.
	public static void staticNormalMethod() {}
	public abstract void abstractMethod();
}
class AbstractExampleChild extends AbstractExample {//��� ����.
	@Override
	public void normalMethod() {}//�������̵� ����.
	@Override
	public void abstractMethod() {}
}
public class Abstract2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
