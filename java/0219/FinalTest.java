/*
 * final : 최종 정의. -> 변경 불가.
 * - final variable : 상수.(한 번 값을 대입하면, 값을 변경할 수 없음.)
 * - 상수의 변수명 선언 규칙 : 모두 대문자 + 단어 이어질 때 _ 사용.
 * - final method : 오버라이드 불가.
 * - final class : 상속 불가.
 */
final class FinalParent {}
//class FinalChild extends FinalParent {}//error - 상속 불가
class FinalParent2 {
	public final void finalMethod() {}
}
class FinalChild2 extends FinalParent2 {
	//public final void finalMethod() {}//error - 오버라이드 불가.
	//public void finalMethod() {}//error - 오버라이드 불가.
	//public int finalMethod() {return 777;}//error - 오버라이드 규칙 위반.
	public final void finalMethod(int i) {}
	public void finalMethod(double d) {}
}
public class FinalTest {
	final double CIRCLE_RATIO = 3.14D;//상수의 변수명 선언 규칙 : 모두 대문자 + 단어 이어질 때 _ 사용.
	public static void main(String[] args) {
		final int CHANGE_TEST;
		CHANGE_TEST = 777;
		//CHANGE_TEST = 123;//error - 상수는 한 번만 대입 가능.
	}

}
