class TestClass {//class는 변수와 메소드를 갖는다.
	//같은 패키지내부에서만 접근가능
	int iVar;
	String sVar;//멤버변수
	public void methodTest1() {
		System.out.println("파라미터 없고 리턴도 하지 않는다.");
	}
	public void methodTest2(int i) {		
		System.out.println("파라미터("+i+") 있고 리턴도 하지 않는다.");
	}
	public String methodTest3(String s) {
		System.out.println("파라미터("+s+") 있고 리턴한다.");
		return s;
	}
}

public class Method {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println(tc.iVar);
		System.out.println(tc.sVar);
		tc.methodTest1();
		tc.methodTest2(777);
		String tmpStr = tc.methodTest3("gogo!!");
		System.out.println(tmpStr);
	}
}
