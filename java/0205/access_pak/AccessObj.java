package access_pak;
/*
 * Access Modifier : 접근 제한자.
 * - public : 누구나 접근 가능. 접근 제한 없음.
 * - protected :같은 폴더 내부 + 상속에서 접근 가능.
 * - default : 같은 폴더 내부에서만 접근.
 * - private : 같은  class 내부에서만 접근 가능.
 */
public class AccessObj {
	public String puStr = "public value";
	protected String proStr = "protected value";
	String deStr = "default value";
	private String priStr = "private value";
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		System.out.println(obj.proStr);
		System.out.println(obj.deStr);
		System.out.println(obj.priStr);
	}
}





