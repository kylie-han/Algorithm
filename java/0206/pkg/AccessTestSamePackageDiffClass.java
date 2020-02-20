package pkg;

public class AccessTestSamePackageDiffClass {
	//2. Same Package, Different Class.
	public static void main(String[] args) {
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		System.out.println(ad.proStr);
		System.out.println(ad.deStr);
		//System.out.println(ad.priStr);//error
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
