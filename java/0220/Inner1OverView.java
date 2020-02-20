/*
 * Inner Class (Nested Class) : 클래스 내부에 선언한 class.
 * instance inner class (member inner class)
 * - class의 멤버 자리에 위치.
 * - 외부 class 생성 후, new를 통해 생성. -> 외부 객체 참조 변수를 통한 접근.
 * - static 변수/메소드 사용 불가.
 * static inner class
 * - class의 멤버 자리에 위치.
 * - static 변수/메소드 사용 가능.
 * - 외부 class name을 통한 접근.
 * local inner class
 * - 메소드 내부에 위치하며, 메소드 내부에서 사용.
 * anonymous inner class
 * - class name 없음. -> 재사용 불가. -> 일회용.
 */
class OutClass{
	//instance inner class
	public class InnerA { }
	protected class InnerB { }//inner class에서는 class에 protected 허용
	class InnerC { }
	private class InnerD { }//inner class에서는 class에 private 허용
	public abstract class InnerE { }
	public interface InnerF { }
	public interface InnerG { }
	public interface InnerH extends InnerF, InnerG { }
	public class InnerI extends InnerE implements InnerF, InnerG { }

	//static inner class
	public static class InnerJ { }

	//local inner class
	public void method(){
		class InnerK{ }
	}
}//class
public class Inner1OverView {
	public static void main(String[] args) {
		System.out.println("inner class의 종류...");
	}
}
