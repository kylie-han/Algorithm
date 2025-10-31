class StaticParent {
	int first = 111;
	static int second = 999;
	public static void gogo() { System.out.println("부모 static 출력"); }
}
class StaticChild extends StaticParent {
	int first = 222;//변수는 오버라이드 개념 없음.
	static int second = 777;//static 변수는 오버라이드 개념 없음.
	public static void gogo() { System.out.println("Child static 출력"); }
	//static 메소드는 오버라이드 개념 없음.
}
public class Static3Inherit {

	public static void main(String[] args) {
		StaticParent p = new StaticChild();
		System.out.println("부모타입변수 : "+p.first);
		System.out.println("부모타입static변수 : "+p.second);
		System.out.print("부모타입static메소드 : ");
		p.gogo();
		StaticParent.gogo();
		StaticChild c = (StaticChild) p;
		System.out.println("자식타입변수 : "+c.first);
		System.out.println("자식타입static변수 : "+c.second);
		System.out.print("자식타입static메소드 : ");
		c.gogo();
		StaticChild.gogo();
	}

}
