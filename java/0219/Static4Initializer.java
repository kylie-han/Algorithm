/*
 * Static Initializer : class load �ÿ�, ���� ���� �� ���� �����ϴ� �ڵ� ��.
 */
class StaticInitialTest {
	static String str;
	static {
		str = "StaticInitialTest";
		System.out.println(str);
	}
}
public class Static4Initializer {
	static {
		System.out.println("Static Initializer...");
	}
	public static void main(String[] args) {
		StaticInitialTest si = new StaticInitialTest();
		StaticInitialTest si2 = new StaticInitialTest();
		StaticInitialTest si3 = new StaticInitialTest();
//		{
//			int hi = 777;
//			System.out.println(hi);
//		}//���� ����
		//System.out.println(hi);//error
	}//main

}
