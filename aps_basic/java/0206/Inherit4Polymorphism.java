/*
 * Polymorphism : 다형성 : 다양한 형태를 의미.
 * - 그리스어 Poly(다양한) + morphos(형태) 유래
 * - 반드시 상속 관계에서만 성립.
 * - 상속 관계에서 부모 class type의 변수가 자식 class type의 객체를 참조하는 것.
 */
/*
 * Polymorphism을 사용하는 이유.
 * - HeteroGeneous Collection : 서종 다른 data type을 저장할 수 있는 자료 구조.
 * - Polymorphic Argument : parameter lists를 부모 class type으로 정의하면,
 *   모든 자식 class type의 객체가 그 메소드를 사용할 수 있다.
 * - method override : 부모에서 정의된 메소드를 자식에서 재정의하여 사용 가능.
 */
class TmpPolyParent {
	String firstName;
	public TmpPolyParent(){
		firstName = "Setting from Parent";
		System.out.println("parent constructor run.......");
	}
	void print() {
		System.out.println(firstName);
	}
}
class TmpPolyChild1 extends TmpPolyParent{
	String position;
}
class TmpPolyChild2 extends TmpPolyParent{
	public TmpPolyChild2() {
		firstName = "Setting from Child2";
		System.out.println("Child2 constructor run.......");
	}
	String brother;
}
public class Inherit4Polymorphism {

	public static void main(String[] args) {
		//String str = new Inherit1OverView();//error
		//String 타입의 변수 str은 자신을 선언한 Reference type의 객체만 참조 가능함.
		//자바 언어에서의 객체 참조 규칙.
		TmpPolyParent p1 = new TmpPolyParent();
		TmpPolyParent p2 = new TmpPolyChild1();
		System.out.println("p2.firstName : " + p2.firstName);
		TmpPolyParent p3 = new TmpPolyChild2();
		System.out.println("p3.firstName : " + p3.firstName);
		//부모 생성자가 수행된 후에, 자식 생성자 수행함을 알 수 있다.
		//자식 객체의 내부에는 부모 객체가 존재한다.
		//따라서, 부모 class type의 변수는 자식 instance 내부에 존재하는,
		//부모 instance를 참조할 수 있다.
		//////////////////////////////////////
		TmpPolyChild1 c1 = new TmpPolyChild1();
		TmpPolyParent p4 = c1;//묵시적 Casting
	}

}




