/*
 * super : �θ� ��ü�� ��ȯ��.
 * - ���� : �θ� ��ü�� ��� ������ ����. super.������.
 * - �޼ҵ� : �θ� ��ü�� ��� �޼ҵ忡 ����. super.�޼ҵ��().
 * - ������ : ������ �ȿ��� ������� ��, �θ� ��ü�� �ٸ� �����ڸ� ȣ��.//�ݵ�� ������ ù�ٿ� ��ġ�ؾ� ��.
 */
class SuperParent {
	String testStr = "super test ...";
	public SuperParent(){}
	public SuperParent(String str){
		testStr = str;
	}
	void print() {
		System.out.println(testStr);
	}
}
class SuperChild extends SuperParent {
	String testStr = "child test ...";
	//�θ𿡼� ����� ������ ���� ������ �ڽĿ����� ������ �� �ִ�.
	//�ٸ�, �켱 �����ʹ� ���谡 ����.//ȣ���ϴ� ������ Ÿ�Կ� ���� ȣ�� ��.
	public SuperChild(){}
	public SuperChild(String str){
		super(str);
		testStr = str;
	}
	void print() {
		System.out.println(super.testStr);//�θ��� ��� ������ ȣ���� ��.
		super.print();//�θ��� ��� �޼ҵ带 ȣ���� ��.
		System.out.println(testStr);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		SuperParent p1 = new SuperParent();
		//System.out.println("p1.testStr : " + p1.testStr);
		//p1.print();
		SuperChild c1 = new SuperChild();
		//System.out.println("c1.testStr : " + c1.testStr);
		//c1.print();
		SuperParent p2 = new SuperChild();
		//System.out.println("p2.testStr : " + p2.testStr);
		//p2.print();
	}

}


