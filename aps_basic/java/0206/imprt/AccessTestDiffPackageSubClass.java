package imprt;

import pkg.AccessData;

public class AccessTestDiffPackageSubClass extends AccessData {
	//4. Different Package, Sub Class.
	public static void main(String[] args) {
		AccessTestDiffPackageSubClass ad = new AccessTestDiffPackageSubClass();
		System.out.println(ad.puStr);
		//public : 접근에 제한이 없는 개념.
		System.out.println(ad.proStr);
		//protected : 상속받은 class에서는 접근 가능.
		//System.out.println(ad.deStr);//error
		//protected+default : 같은 package 내부에서만 접근 가능. 다른 package에서는 접근 불가.
		//System.out.println(ad.priStr);//error
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
