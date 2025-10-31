/*
 * abstract : 미완성 표시.
 * abstract method : 미완성 메소드 .
 * - 구현부{}가 없는 메소드.
 * - {} 대신 ; 으로 종료.
 * - 메소드가 수행해야 하는 작업의 내용과 절차가 없음.
 * abstract class : 미완성 class.
 * - abstract method 있는 class.
 * - 미완성이기 때문에, instance(메모리 할당) 불가.
 * 사용 이유.
 * - 상속받아 구현 해라! - 강제.
 * - 상속받는 class들은 이런 형태를 갖추어야 한다! - 가이드.(명세서)
 */
abstract class AbstractClass {
	public abstract void test();
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
