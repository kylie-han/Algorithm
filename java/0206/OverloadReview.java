/*
 * Method Overload : �ߺ� ���� (���� �޼ҵ���� �ߺ� ������ �� �ִ�.)
 * - �ϳ��� class���� �Ķ���Ͱ� �ٸ� ���� �̸��� �޼ҵ带 ������ �����ϴ� ��.
 * - return type���� ������.
 * - �޼ҵ�� �̸��� �Ķ���ͷ� ���еǱ� ������,
 *   �̸��� ���Ƶ�, �Ķ���Ͱ� �ٸ���, �ٸ� �޼ҵ�� �ν��Ѵ�.
 * - ������ ����� �ٷ�� data�� �ٸ� ��� ���� �����ϴ�.
 * ��) System.out.print(777);
 *    System.out.print("hi");
 */
public class OverloadReview {

	public void overTest() {}
	//public int overTest() {return 777;}//error
	public void overTest(int i) {}
	public void overTest(int i, String s) {}
	public static void main(String[] args) {
		System.out.println("OverloadReview.....");
	}

}
