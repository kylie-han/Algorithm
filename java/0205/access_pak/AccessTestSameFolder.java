package access_pak;

public class AccessTestSameFolder {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.puStr);
		System.out.println(obj.proStr);
		System.out.println(obj.deStr);
		//System.out.println(obj.priStr);//error
		//private : ���� class������ ���� ����. �ٸ� class������ ���� �Ұ�.
	}

}
