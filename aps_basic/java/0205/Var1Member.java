/*
 * 초기화 : 최초로 변수에 값을 대입하는 행위.
 * 변수의 종류 
 * - 멤버 : class 내부에 존재, instance 생성에서부터 소멸까지 존재.
 * - 로컬 : 메소드 내부에 존재, 메소드 호출 시 생성, 메소드 종료 시 소멸.
 * - static : class load 시에 메모리를 확보하는 변수, 메소드.
 *            class load 시부터, class area에서 class 삭제되는 순간까지.
 */
public class Var1Member {
	int memVar=777;//기본값으로 초기화.
	int i;//0
	double d;//0.0
	char ch;//공백 한칸
	boolean bool;//false
	//멤버 변수는 기본값으로 자동 초기화 됨.
	public void testMethod() {
		int localVar = 0;
		//지역변수는 자동 초기화가 없음. 선언과 함께 초기화 필요.
		System.out.println(localVar);
		int memVar=111;
		//멤버 변수와 이름이 같은 지역 변수 선언 가능.
		//멤버 변수와 지역 변수의 이름이 같으면, 우선 순위는 지역변수가 가짐.
		System.out.println("testMethod : "+memVar);
	}
	public static void main(String[] args) {
		Var1Member v1 = new Var1Member();
		System.out.println(v1.ch);
		System.out.println(v1.i+" : "+v1.d+" : "+v1.bool);
		System.out.println(v1.memVar);
		v1.testMethod();
	}

}
