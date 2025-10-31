/*
 * super : 부모 객체를 반환함.
 * - 변수 : 부모 객체의 멤버 변수에 접근. super.변수명.
 * - 메소드 : 부모 객체의 멤버 메소드에 접근. super.메소드명().
 * - 생성자 : 생성자 안에서 사용했을 때, 부모 객체의 다른 생성자를 호출.//반드시 생성자 첫줄에 위치해야 함.
 */
class SuperParent {
	String testStr = "super test ...";
	public SuperParent(){}
	public SuperParent(String str){
		testStr = str;
	}
	void print() {
		System.out.println(testStr);
	}
}
class SuperChild extends SuperParent {
	String testStr = "child test ...";
	//부모에선 선언된 변수와 같은 변수를 자식에서도 선언할 수 있다.
	//다만, 우선 순위와는 관계가 없음.//호출하는 변수의 타입에 따라서 호출 됨.
	public SuperChild(){}
	public SuperChild(String str){
		super(str);
		testStr = str;
	}
	void print() {
		System.out.println(super.testStr);//부모의 멤버 변수를 호출할 때.
		super.print();//부모의 멤버 메소드를 호출할 때.
		System.out.println(testStr);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		SuperParent p1 = new SuperParent();
		//System.out.println("p1.testStr : " + p1.testStr);
		//p1.print();
		SuperChild c1 = new SuperChild();
		//System.out.println("c1.testStr : " + c1.testStr);
		//c1.print();
		SuperParent p2 = new SuperChild();
		//System.out.println("p2.testStr : " + p2.testStr);
		//p2.print();
	}

}


