package access_imp;

import access_pak.AccessObj;

public class AccessTestSubClass extends AccessObj {

	public static void main(String[] args) {
		AccessTestSubClass obj = new AccessTestSubClass();
		System.out.println(obj.puStr);
		System.out.println(obj.proStr);
		//protected : ��ӹ��� class���� ���� ����.
		//System.out.println(obj.deStr);//error
		//protected+default : ���� ���������� ���� ����. �ٸ� ���������� ���� �Ұ�.
		//System.out.println(obj.priStr);//error
		//private : ���� class������ ���� ����. �ٸ� class������ ���� �Ұ�.
	}

}
