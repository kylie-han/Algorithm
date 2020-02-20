/*
 * method overload
 * - 메소드의 identity는 name + parameter(arguments) lists.
 * - return type은 method overload와 무관함.
 * - 하나의 class 내부에, 동일한 method name을 가지면서,
 *   parameter(arguments) lists를 달리하는, 메소드를 여러개 선언하는 것.
 * - 메소드 중복 정의.
 * - 동일한 기능을 수행한다면, 다루는 data가 다르더라도, 하나의 이름으로 접근하는 것이 편리함.
 * 예) System.out.print(777);
 *    System.out.print("hi");
 */
public class Method3Overload {
	public void testOverload() {}
	//public int testOverload() {}//error
	public void testOverload(int i) {}
	public void testOverload(int i, String s) {}
	public void testOverload(double d) {}
}
