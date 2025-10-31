class StaticVarTest {
	int nonInt;
	static int yesInt;
	StaticVarTest(){
		nonInt++;
		yesInt++;//오직 한 번만 메모리 생성 및 공유.
	}
}
public class Static2OnlyOne {
	public static void main(String[] args) {
		StaticVarTest sv1 = new StaticVarTest();
		System.out.println(sv1.nonInt+" : "+sv1.yesInt);
		StaticVarTest sv2 = new StaticVarTest();
		System.out.println(sv2.nonInt+" : "+sv2.yesInt);
		StaticVarTest sv3 = new StaticVarTest();
		System.out.println(sv3.nonInt+" : "+sv3.yesInt);
		System.out.println(StaticVarTest.yesInt);
	}

}
