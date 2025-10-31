/*
 * Method Override : ������(���� ����)
 * - ��Ӱ��迡�� �θ� class�� ���ǵ� �޼ҵ带 �ڽ� class���� ������(���� ����) �ϴ� ��.
 * - �θ� class���� ���ǵ� �޼ҵ�� return type, method name, parameter lists�� ���ƾ� ��.
 * - ȣ�� �켱 ���� : �ڽĿ��� �����ǵ� �޼ҵ尡 �켱���� ����.
 */
class OverrideParent {
	void print() { System.out.println("11111 Parent Method....."); }
}
class OverrideChild extends OverrideParent {
	//�ùٸ� ��)�� return type, method name, parameter lists�� ����.
	void print() { System.out.println("99999 Child Method....."); }
	//�߸��� ��) return type�� �ٸ��� override �ƴ�.
	//int print() { System.out.println("99999 Child Method....."); return 777; }//error
	//�߸��� ��) parameter lists�� �ٸ��� �ٸ� �޼ҵ� ( override �ƴ�).
	void print(int i) { System.out.println("99999 Child Method....."); }
}
public class Inherit3Override {
	public static void main(String[] args) {
		OverrideChild ch1 = new OverrideChild();
		ch1.print();//ȣ�� �켱 ������ �ڽ� class �� ����.
	}
}
