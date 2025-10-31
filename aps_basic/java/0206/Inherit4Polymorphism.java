/*
 * Polymorphism : ������ : �پ��� ���¸� �ǹ�.
 * - �׸����� Poly(�پ���) + morphos(����) ����
 * - �ݵ�� ��� ���迡���� ����.
 * - ��� ���迡�� �θ� class type�� ������ �ڽ� class type�� ��ü�� �����ϴ� ��.
 */
/*
 * Polymorphism�� ����ϴ� ����.
 * - HeteroGeneous Collection : ���� �ٸ� data type�� ������ �� �ִ� �ڷ� ����.
 * - Polymorphic Argument : parameter lists�� �θ� class type���� �����ϸ�,
 *   ��� �ڽ� class type�� ��ü�� �� �޼ҵ带 ����� �� �ִ�.
 * - method override : �θ𿡼� ���ǵ� �޼ҵ带 �ڽĿ��� �������Ͽ� ��� ����.
 */
class TmpPolyParent {
	String firstName;
	public TmpPolyParent(){
		firstName = "Setting from Parent";
		System.out.println("parent constructor run.......");
	}
	void print() {
		System.out.println(firstName);
	}
}
class TmpPolyChild1 extends TmpPolyParent{
	String position;
}
class TmpPolyChild2 extends TmpPolyParent{
	public TmpPolyChild2() {
		firstName = "Setting from Child2";
		System.out.println("Child2 constructor run.......");
	}
	String brother;
}
public class Inherit4Polymorphism {

	public static void main(String[] args) {
		//String str = new Inherit1OverView();//error
		//String Ÿ���� ���� str�� �ڽ��� ������ Reference type�� ��ü�� ���� ������.
		//�ڹ� ������ ��ü ���� ��Ģ.
		TmpPolyParent p1 = new TmpPolyParent();
		TmpPolyParent p2 = new TmpPolyChild1();
		System.out.println("p2.firstName : " + p2.firstName);
		TmpPolyParent p3 = new TmpPolyChild2();
		System.out.println("p3.firstName : " + p3.firstName);
		//�θ� �����ڰ� ����� �Ŀ�, �ڽ� ������ �������� �� �� �ִ�.
		//�ڽ� ��ü�� ���ο��� �θ� ��ü�� �����Ѵ�.
		//����, �θ� class type�� ������ �ڽ� instance ���ο� �����ϴ�,
		//�θ� instance�� ������ �� �ִ�.
		//////////////////////////////////////
		TmpPolyChild1 c1 = new TmpPolyChild1();
		TmpPolyParent p4 = c1;//������ Casting
	}

}




