/*
 * instance inner class
 * - class의 멤버 자리에 위치하기 때문에, member inner class라고도 함
 * - static 변수/메소드 사용 불가.
 * - new를 통해 객체 생성하므로, instance inner class라고 함
 * - 외부 class 생성 후, new를 통해 생성. -> 외부 객체 참조 변수를 통한 접근.
 * - 생성 방법에 주의할 것!!!
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






