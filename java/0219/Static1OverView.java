/*
 * static : ClassLoader�� class�� �޸𸮿� load�� ��, �޸𸮸� ���� �Ҵ�.
 * - class load �ÿ� ��������Ƿ�, ClassName.������/�޼ҵ������ ���� ����.
 * - class load �ÿ� �� ���� �޸𸮸� �Ҵ�.
 * - ��ü�� ���� ������ �޸𸮸� �Ҵ��ϴ� ���� �ƴ�.
 * - ���� �� ���� �޸� ���� �� ����.
 * - static(�޸𸮿� ����)�� non-static(�޸𸮿� ������) ���� �Ұ�.
 */
public class Static1OverView {
	String nonSVar = "no!!!";
	static String sVar = "yes!!!";
	public void nonSMethod() {}
	public static void sMethod() {}
	public static void main(String[] args) {
		System.out.println(sVar);
		sMethod();
		//System.out.println(nonSVar);//error - static�� non-static ���� �Ұ�
		//nonSMethod();//error - static�� non-static ���� �Ұ�
	}

}
