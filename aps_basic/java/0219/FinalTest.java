/*
 * final : ���� ����. -> ���� �Ұ�.
 * - final variable : ���.(�� �� ���� �����ϸ�, ���� ������ �� ����.)
 * - ����� ������ ���� ��Ģ : ��� �빮�� + �ܾ� �̾��� �� _ ���.
 * - final method : �������̵� �Ұ�.
 * - final class : ��� �Ұ�.
 */
final class FinalParent {}
//class FinalChild extends FinalParent {}//error - ��� �Ұ�
class FinalParent2 {
	public final void finalMethod() {}
}
class FinalChild2 extends FinalParent2 {
	//public final void finalMethod() {}//error - �������̵� �Ұ�.
	//public void finalMethod() {}//error - �������̵� �Ұ�.
	//public int finalMethod() {return 777;}//error - �������̵� ��Ģ ����.
	public final void finalMethod(int i) {}
	public void finalMethod(double d) {}
}
public class FinalTest {
	final double CIRCLE_RATIO = 3.14D;//����� ������ ���� ��Ģ : ��� �빮�� + �ܾ� �̾��� �� _ ���.
	public static void main(String[] args) {
		final int CHANGE_TEST;
		CHANGE_TEST = 777;
		//CHANGE_TEST = 123;//error - ����� �� ���� ���� ����.
	}

}
