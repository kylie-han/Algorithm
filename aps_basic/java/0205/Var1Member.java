/*
 * �ʱ�ȭ : ���ʷ� ������ ���� �����ϴ� ����.
 * ������ ���� 
 * - ��� : class ���ο� ����, instance ������������ �Ҹ���� ����.
 * - ���� : �޼ҵ� ���ο� ����, �޼ҵ� ȣ�� �� ����, �޼ҵ� ���� �� �Ҹ�.
 * - static : class load �ÿ� �޸𸮸� Ȯ���ϴ� ����, �޼ҵ�.
 *            class load �ú���, class area���� class �����Ǵ� ��������.
 */
public class Var1Member {
	int memVar=777;//�⺻������ �ʱ�ȭ.
	int i;//0
	double d;//0.0
	char ch;//���� ��ĭ
	boolean bool;//false
	//��� ������ �⺻������ �ڵ� �ʱ�ȭ ��.
	public void testMethod() {
		int localVar = 0;
		//���������� �ڵ� �ʱ�ȭ�� ����. ����� �Բ� �ʱ�ȭ �ʿ�.
		System.out.println(localVar);
		int memVar=111;
		//��� ������ �̸��� ���� ���� ���� ���� ����.
		//��� ������ ���� ������ �̸��� ������, �켱 ������ ���������� ����.
		System.out.println("testMethod : "+memVar);
	}
	public static void main(String[] args) {
		Var1Member v1 = new Var1Member();
		System.out.println(v1.ch);
		System.out.println(v1.i+" : "+v1.d+" : "+v1.bool);
		System.out.println(v1.memVar);
		v1.testMethod();
	}

}
