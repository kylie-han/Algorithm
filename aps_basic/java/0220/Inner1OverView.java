/*
 * Inner Class (Nested Class) : Ŭ���� ���ο� ������ class.
 * instance inner class (member inner class)
 * - class�� ��� �ڸ��� ��ġ.
 * - �ܺ� class ���� ��, new�� ���� ����. -> �ܺ� ��ü ���� ������ ���� ����.
 * - static ����/�޼ҵ� ��� �Ұ�.
 * static inner class
 * - class�� ��� �ڸ��� ��ġ.
 * - static ����/�޼ҵ� ��� ����.
 * - �ܺ� class name�� ���� ����.
 * local inner class
 * - �޼ҵ� ���ο� ��ġ�ϸ�, �޼ҵ� ���ο��� ���.
 * anonymous inner class
 * - class name ����. -> ���� �Ұ�. -> ��ȸ��.
 */
class OutClass{
	//instance inner class
	public class InnerA { }
	protected class InnerB { }//inner class������ class�� protected ���
	class InnerC { }
	private class InnerD { }//inner class������ class�� private ���
	public abstract class InnerE { }
	public interface InnerF { }
	public interface InnerG { }
	public interface InnerH extends InnerF, InnerG { }
	public class InnerI extends InnerE implements InnerF, InnerG { }

	//static inner class
	public static class InnerJ { }

	//local inner class
	public void method(){
		class InnerK{ }
	}
}//class
public class Inner1OverView {
	public static void main(String[] args) {
		System.out.println("inner class�� ����...");
	}
}
