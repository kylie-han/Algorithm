class StaticParent {
	int first = 111;
	static int second = 999;
	public static void gogo() { System.out.println("�θ� static ���"); }
}
class StaticChild extends StaticParent {
	int first = 222;//������ �������̵� ���� ����.
	static int second = 777;//static ������ �������̵� ���� ����.
	public static void gogo() { System.out.println("Child static ���"); }
	//static �޼ҵ�� �������̵� ���� ����.
}
public class Static3Inherit {

	public static void main(String[] args) {
		StaticParent p = new StaticChild();
		System.out.println("�θ�Ÿ�Ժ��� : "+p.first);
		System.out.println("�θ�Ÿ��static���� : "+p.second);
		System.out.print("�θ�Ÿ��static�޼ҵ� : ");
		p.gogo();
		StaticParent.gogo();
		StaticChild c = (StaticChild) p;
		System.out.println("�ڽ�Ÿ�Ժ��� : "+c.first);
		System.out.println("�ڽ�Ÿ��static���� : "+c.second);
		System.out.print("�ڽ�Ÿ��static�޼ҵ� : ");
		c.gogo();
		StaticChild.gogo();
	}

}
