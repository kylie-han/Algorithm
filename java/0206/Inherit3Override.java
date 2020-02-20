/*
 * Method Override : 재정의(덮어 쓰기)
 * - 상속관계에서 부모 class에 정의된 메소드를 자식 class에서 재정의(덮어 쓰기) 하는 것.
 * - 부모 class에서 정의된 메소드와 return type, method name, parameter lists가 같아야 함.
 * - 호출 우선 순위 : 자식에서 재정의된 메소드가 우선권을 가짐.
 */
class OverrideParent {
	void print() { System.out.println("11111 Parent Method....."); }
}
class OverrideChild extends OverrideParent {
	//올바른 예)ㅡ return type, method name, parameter lists가 같음.
	void print() { System.out.println("99999 Child Method....."); }
	//잘못된 예) return type이 다르면 override 아님.
	//int print() { System.out.println("99999 Child Method....."); return 777; }//error
	//잘못된 예) parameter lists가 다르면 다른 메소드 ( override 아님).
	void print(int i) { System.out.println("99999 Child Method....."); }
}
public class Inherit3Override {
	public static void main(String[] args) {
		OverrideChild ch1 = new OverrideChild();
		ch1.print();//호출 우선 순위는 자식 class 가 가짐.
	}
}
