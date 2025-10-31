/*
 * instance inner class
 * - class�� ��� �ڸ��� ��ġ�ϱ� ������, member inner class��� ��
 * - static ����/�޼ҵ� ��� �Ұ�.
 * - new�� ���� ��ü �����ϹǷ�, instance inner class��� ��
 * - �ܺ� class ���� ��, new�� ���� ����. -> �ܺ� ��ü ���� ������ ���� ����.
 * - ���� ����� ������ ��!!!
 * 		Outer2 o2 = new Outer2();
 *		Outer2.InnerA ia = o2.new InnerA();
 */
class OutClass2 {
	private int outInt = 123;
	private static int staticOutInt = 456;
	public class InnerA {
		//static int staticInnerVar = 100;//error
		//static void staticInnerMethod() {}//error
		static final double CIRCLE_RATIO = 3.14D;
		int innerInt;
		String innerStr = "inner class test...";
		InnerA() {
			innerInt = 100;
		}
		void printInnerA() {
			outInt = 777;
			staticOutInt = 999;
			System.out.println("outInt : "+outInt);
			System.out.println("staticOutInt : "+staticOutInt);
			System.out.println("innerStr : "+innerStr);
		}
	}//class
}//class
public class Inner2Instance {

	public static void main(String[] args) {
		OutClass2 out = new OutClass2();
		OutClass2.InnerA ia = out.new InnerA();
		ia.printInnerA();
	}

}






