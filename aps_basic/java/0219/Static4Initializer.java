/*
 * Static Initializer : class load 시에, 최초 오직 한 번만 수행하는 코드 블럭.
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
//		}//지역 설정
		//System.out.println(hi);//error
	}//main

}
