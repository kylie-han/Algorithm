/*
 * interface�� implements�� ���� ��� ���� ���� ����.
 * - �������� ���� class�鿡�� �������� �ο�.
 * - ��� ���踦 ����, ������ ������ �����ϵ��� ����� �ش�.
 * - Heterogeneous Collection, Polymorphic Arguments ��� ����.
 */
class ������ {}
class ����� {}
class ��� extends ������ implements FunctionWalk {
	@Override
	public void walk() {}
}
class ������ extends ����� implements FunctionWalk {
	@Override
	public void walk() {}
}
interface FunctionWalk {
	public void walk();
}
public class Interface4Poly {
	public static void main(String[] args) {
		������ [] parr = new ������[2];
		parr[0] = new ���();
		//parr[1] = new ������();//error - data type �ٸ�.
		FunctionWalk [] farr = new FunctionWalk[2];
		farr[0] = new ���();
		farr[1] = new ������();//Heterogeneous Collection - �ٸ� data type�� ���� ������ �ڷ� ����.
	}

}
