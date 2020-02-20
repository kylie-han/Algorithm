/*
 * abstract class
 * - instance 생성이 안되는 점을 제외하고는, 일반 class와 다른 바 없음.
 */
abstract class AbstractExample {
	int normalMemberVar = 777;//정상적인 변수 선언 가능.
	static int staticNormalMemberVar = 999;
	final double CIRCLE_RATIO = 3.14;
	public void normalMethod() {}//정상적인 메소드 선언 가능.
	public static void staticNormalMethod() {}
	public abstract void abstractMethod();
}
class AbstractExampleChild extends AbstractExample {//상속 가능.
	@Override
	public void normalMethod() {}//오버라이드 가능.
	@Override
	public void abstractMethod() {}
}
public class Abstract2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
