/*
 * Method Overload : 중복 선언 (같은 메소드명을 중복 선언할 수 있다.)
 * - 하나의 class에서 파라미터가 다른 같은 이름의 메소드를 여러개 선언하는 것.
 * - return type과는 무관함.
 * - 메소드는 이름과 파라미터로 구분되기 때문에,
 *   이름이 같아도, 파라미터가 다르면, 다른 메소드로 인식한다.
 * - 동일한 기능의 다루는 data가 다른 경우 적용 가능하다.
 * 예) System.out.print(777);
 *    System.out.print("hi");
 */
public class OverloadReview {

	public void overTest() {}
	//public int overTest() {return 777;}//error
	public void overTest(int i) {}
	public void overTest(int i, String s) {}
	public static void main(String[] args) {
		System.out.println("OverloadReview.....");
	}

}
