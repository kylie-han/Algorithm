package imprt;

import pkg.AccessData;

public class AccessTestDiffPackageSubClass extends AccessData {
	//4. Different Package, Sub Class.
	public static void main(String[] args) {
		AccessTestDiffPackageSubClass ad = new AccessTestDiffPackageSubClass();
		System.out.println(ad.puStr);
		//public : ���ٿ� ������ ���� ����.
		System.out.println(ad.proStr);
		//protected : ��ӹ��� class������ ���� ����.
		//System.out.println(ad.deStr);//error
		//protected+default : ���� package ���ο����� ���� ����. �ٸ� package������ ���� �Ұ�.
		//System.out.println(ad.priStr);//error
		//private : ���� class ���ο����� ���� ����. �ٸ� class������ ���� �Ұ�.
	}

}
