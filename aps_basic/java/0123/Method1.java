class TestClass {//class는 변수(data)와 메소드(function)를 갖는다.
	int iVar;
	String sVar;//Member 변수
	public void methodTest1() {
		System.out.println("no param, no return.");
	}
	public void methodTest2(int i) {
		System.out.println("yes param, no return. " + i);
	}
	public String methodTest3(int i, String s) {
		return "yes param, yes return. " + s;
	}
}

public class Method1 {//실행 class - main

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println(tc.iVar);
		System.out.println(tc.sVar);
		tc.methodTest1();
		tc.methodTest2(777);
		String tmpStr = tc.methodTest3(777, "gogo!!!");
		System.out.println(tmpStr);
	}

}
