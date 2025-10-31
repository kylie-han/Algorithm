/*
 * static inner class
 * - static ������ �� inner class
 * - class�� ��� �ڸ��� ��ġ.
 * - new ��� ���� �޸� �Ҵ��
 * - static ����/�޼ҵ� ��� ����.
 */
class OutClass3 {
	int outInt = 123;
	static int staticOutInt = 456;
	public static class InnerA {
		static int staticInnerInt;
		static String staticInnerStr="staticInnerStr...";
		public static void staticInnerMethod() {
			System.out.println("staticOutInt : "+staticOutInt);
			System.out.println("staticInnerInt : "+staticInnerInt);
			//System.out.println("outInt : "+outInt);//error
			//System.out.println("inneInt : "+inneInt);//error
			System.out.println("staticInnerStr : "+staticInnerStr);
		}
		int inneInt;
		String innerStr="innerStr...";;
		public void innerMethod() {
			System.out.println("staticOutInt : "+staticOutInt);
			System.out.println("staticInnerInt : "+staticInnerInt);
			//System.out.println("outInt : "+outInt);//error
			System.out.println("inneInt : "+inneInt);
			System.out.println("innerStr : "+innerStr);
		}
	}//class
}//class
public class Inner3Static {

	public static void main(String[] args) {
		OutClass3.InnerA.staticInnerMethod();
		OutClass3.InnerA ia = new OutClass3.InnerA();
		ia.innerMethod();
	}

}




