package access_imp;

import access_pak.AccessObj;

public class AccessTestDiffFolder {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		//System.out.println(obj.proStr);//error
		//System.out.println(obj.deStr);//error
		//protected+default : ���� ���������� ���� ����. �ٸ� ���������� ���� �Ұ�.
		//System.out.println(obj.priStr);//error
		//private : ���� class������ ���� ����. �ٸ� class������ ���� �Ұ�.
	}

}
