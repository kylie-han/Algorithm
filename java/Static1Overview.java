/** 
 * static : ClassLoader�� class�� �޸𸮿� load�� ��, �޸𸮸� ���� �Ҵ�
 * 	- class load�ÿ� ��������Ƿ�, ClassName.������/�޼ҵ������ ���� ����/
 * 	- class load�ÿ� �ѹ��� �޸𸮸� �Ҵ�;
 * 	- ��ü�� ���� ������ �޸𸮸� �Ҵ��ϴ� ���� �ƴ�
 * 	- ���� �ѹ��� �޸� ���� �� ����
 * 	- static(�޸𸮿� ����)�� non-static(�޸𸮿� ������) ���� �Ұ�
 * 
 * */
public class Static1Overview {
	String nonSvar = "no";
	static String Svar = "yes";
	public void nonSMethod() {}
	public static void SMethod() {}
	public static void main(String[] args) {
//		System.out.println(nonSvar);//static�� ���θ޼ҵ�� non-static�� nonSvar�� ���� �Ұ��ϴ�.
		System.out.println(Svar);
//		nonSMethod();//static�� ���θ޼ҵ�� non-static�� nonSMethod�� ���� �Ұ��ϴ�.
		SMethod();
	}//end of main
}//end of class
