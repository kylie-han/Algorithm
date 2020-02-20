import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Override Access Modifiers, Exception
 */
class AddSup {
	void access() {}
	void exception() throws IOException {}
}
class AddSub extends AddSup {
	public void access() {}
	//private void access() {}//error
	/*Override 할 때, Access Modifiers는
	 * 원래 Access Modifiers 보다, 접근을 완화하는 것은 가능.
	 * 원래 Access Modifiers 보다, 접근을 강화하는 것은 불가능.
	 */
	void exception() throws FileNotFoundException {}
	//void exception() throws Exception {}//error
	/*Override 할 때, Exception은
	 * 원래 Exception 보다, 상위 class는 불가능.
	 * 원래 Exception 보다, 하위 class는  가능.
	 * Exception <- IOException <- FileNotFoundException
	 */
	@Override//compiler에게 override 문법 검사를 요청하는 표현.
	public String toString() {
		//최상위 class인 Object의 toString() 메소드를 Override 한 것.
		return "this is toString override";
	}
}
public class OverrideAdd {
	public static void main(String[] args) {
		AddSub s = new AddSub();
		System.out.println(s);
	}
}







