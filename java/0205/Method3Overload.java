/*
 * method overload
 * - �޼ҵ��� identity�� name + parameter(arguments) lists.
 * - return type�� method overload�� ������.
 * - �ϳ��� class ���ο�, ������ method name�� �����鼭,
 *   parameter(arguments) lists�� �޸��ϴ�, �޼ҵ带 ������ �����ϴ� ��.
 * - �޼ҵ� �ߺ� ����.
 * - ������ ����� �����Ѵٸ�, �ٷ�� data�� �ٸ�����, �ϳ��� �̸����� �����ϴ� ���� ����.
 * ��) System.out.print(777);
 *    System.out.print("hi");
 */
public class Method3Overload {
	public void testOverload() {}
	//public int testOverload() {}//error
	public void testOverload(int i) {}
	public void testOverload(int i, String s) {}
	public void testOverload(double d) {}
}
