class TestClass {//class�� ������ �޼ҵ带 ���´�.
	//���� ��Ű�����ο����� ���ٰ���
	int iVar;
	String sVar;//�������
	public void methodTest1() {
		System.out.println("�Ķ���� ���� ���ϵ� ���� �ʴ´�.");
	}
	public void methodTest2(int i) {		
		System.out.println("�Ķ����("+i+") �ְ� ���ϵ� ���� �ʴ´�.");
	}
	public String methodTest3(String s) {
		System.out.println("�Ķ����("+s+") �ְ� �����Ѵ�.");
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
