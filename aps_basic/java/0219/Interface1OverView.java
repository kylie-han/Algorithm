/*
 * interface
 * - class 선언 대신에 interface 선언을 사용.
 * - 특수한 형태의 class.
 * - implements 통해 상속을 해줄 수 있음.
 * - 상수 선언만 가능.
 * - abstract 메소드만 선언 가능.
 * - 객체 생성 불가.
 * 사용 이유.
 * - 상속받아 구현 해라! - 강제.
 * - 상속받는 class들은 이런 형태를 갖추어야 한다! - 가이드.(명세서)
 */
interface InterfaceTest {//상수와 abstract 메소드 선언만 가능.
	int intVar = 777;//자동으로 public static final 선언.
	static int staticIntVar = 888;
	final int finalIntVar = 999;
	void normalMethod();//자동으로 public abstract 선언.
	//void normalMethod2() {}//error - 자동으로 public abstract 선언.
}
public class Interface1OverView {

	public static void main(String[] args) {
		//InterfaceTest it = new InterfaceTest();//error - 객체 생성 불가.
		//InterfaceTest.intVar = 111;//error - 상수.
		System.out.println(InterfaceTest.intVar);
		System.out.println(InterfaceTest.staticIntVar);
		System.out.println(InterfaceTest.finalIntVar);
	}

}
