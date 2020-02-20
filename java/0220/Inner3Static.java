/*
 * static inner class
 * - static 선언이 된 inner class
 * - class의 멤버 자리에 위치.
 * - new 사용 없이 메모리 할당됨
 * - static 변수/메소드 사용 가능.
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




