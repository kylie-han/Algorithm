package imprt;

import pkg.AccessData;

public class AccessTestDiffPackageDiffClass {
	//3. Different Package, Different Class.
	public static void main(String[] args) {
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		//System.out.println(ad.proStr);//error
		//System.out.println(ad.deStr);//error
		//protected+default : 같은 package 내부에서만 접근 가능. 다른 package에서는 접근 불가.
		//System.out.println(ad.priStr);//error
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
