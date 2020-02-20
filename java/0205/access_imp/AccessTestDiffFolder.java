package access_imp;

import access_pak.AccessObj;

public class AccessTestDiffFolder {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		//System.out.println(obj.proStr);//error
		//System.out.println(obj.deStr);//error
		//protected+default : 같은 폴더에서만 접근 가능. 다른 폴더에서는 접근 불가.
		//System.out.println(obj.priStr);//error
		//private : 같은 class에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
