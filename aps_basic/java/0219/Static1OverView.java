/*
 * static : ClassLoader가 class를 메모리에 load할 때, 메모리를 먼저 할당.
 * - class load 시에 만들어지므로, ClassName.변수명/메소드명으로 접근 가능.
 * - class load 시에 한 번만 메모리를 할당.
 * - 객체를 만들 때마다 메모리를 할당하는 것이 아님.
 * - 오직 한 번만 메모리 생성 및 공유.
 * - static(메모리에 존재)은 non-static(메모리에 미존재) 접근 불가.
 */
public class Static1OverView {
	String nonSVar = "no!!!";
	static String sVar = "yes!!!";
	public void nonSMethod() {}
	public static void sMethod() {}
	public static void main(String[] args) {
		System.out.println(sVar);
		sMethod();
		//System.out.println(nonSVar);//error - static은 non-static 접근 불가
		//nonSMethod();//error - static은 non-static 접근 불가
	}

}
