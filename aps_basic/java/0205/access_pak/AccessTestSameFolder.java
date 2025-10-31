package access_pak;

public class AccessTestSameFolder {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		System.out.println(obj.proStr);
		System.out.println(obj.deStr);
		//System.out.println(obj.priStr);//error
		//private : 같은 class에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
