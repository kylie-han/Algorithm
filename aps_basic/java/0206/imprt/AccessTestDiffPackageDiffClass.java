package imprt;

import pkg.AccessData;

public class AccessTestDiffPackageDiffClass {
	//3. Different Package, Different Class.
	public static void main(String[] args) {
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		//System.out.println(ad.proStr);//error
		//System.out.println(ad.deStr);//error
		//protected+default : ���� package ���ο����� ���� ����. �ٸ� package������ ���� �Ұ�.
		//System.out.println(ad.priStr);//error
		//private : ���� class ���ο����� ���� ����. �ٸ� class������ ���� �Ұ�.
	}

}
