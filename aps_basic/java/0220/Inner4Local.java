/*
 * local inner class
 * - method 내부에 선언된 inner class
 * - class 선언과 new를 통한 생성을 모두 method 안에서 수행
 */
public class Inner4Local {
	int outInt = 123;
	static int staticOutInt = 456;
	public void outMethod(int outArgs) {
		int localVar = 999;
		class InnerA {
			String innerStr = "local inner class...";
			public void printInnerA() {
				//outArgs = 789;//error
				//localVar = 888;//error
				outInt = 123;
				staticOutInt = 456;
				System.out.println("outInt : "+outInt);
				System.out.println("staticOutInt : "+staticOutInt);
				System.out.println("outArgs : "+outArgs);
				System.out.println("localVar : "+localVar);
				System.out.println("innerStr : "+innerStr);
			}
		}//class
		InnerA ia = new InnerA();
		ia.printInnerA();
	}//outMethod
	public static void main(String[] args) {
		Inner4Local i4 = new Inner4Local();
		i4.outMethod(555);
	}

}
