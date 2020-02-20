/*
 * Inhritance : ���.
 * - �ٸ� class�� ������ ����(������ �޼ҵ�)��, ��� ���踦 ���ؼ�, ������ �� �ִ�.
 * - extends Ű���带 ���� ��� ���踦 ����.
 * ��) ParkCH extends Tusu
 *     - ����ȣ class�� ���� class�� ������ �޼ҵ带 ��� �޾Ҵ�.
 *     - ����ȣ class�� ���� class�� Ȯ���ߴ�.
 * - ����� �ִ� class : super, parent, ���� class.
 * - ����� �޴� class : sub, child, ���� class.
 * - �θ� class�� �ڽ� class���� ���� ����� �κ��� ����. : generalize
 * - �ڽ� class�� �ڽĸ��� ������ �κ��� ����. : specialize
 * - class diagram : �ڽ� -�� �θ� (�Ǽ�+���̺�ﰢ��)
 * - ��� ����� is a relation. : �ڽ��� �θ��� �� �����̴�.
 * ��) ����ȣ extends ����, ������ extends ����
 *     - ����ȣ�� ������ �� �����̴�. - O
 *       �������� ������ �� �����̴�. - O
 *       ���� ��) ����ȣ�� �������� �� �����̴�. - X
 *              ������ ����ȣ�� �� �����̴�. - X
 *     - sub class is a super class. - O
 *     - super class is a sub class. - X
 *     - sub class is a sub class. - X
 * - �ڹ��� ����� ���� ���.
 * ��) A extends B. - O
 * ���� ��) A extends B, C. - X
 * ��) B extends C.
 *     A extends B.
 */
/*
 * ����� ����ϴ� ����.
 * - ������ ���� ������.
 * - �ڵ� ���뼺�� ���δ�.
 * - ������ �߰� ������ ���� ������.
 * - ���α׷��� Ȯ��� ���������� �������� ����.
 */
class Tusu {
	double ballSpeed;//���� : ���� �ӵ�
	String pitch() {//���� ������.
		return "strike";
	}
}
class ParkCH extends Tusu {
	String [] buildingList;//�ǹ� ���
	void buyBuilding() {}
}
class RyuHJ extends Tusu {
	String [] buildingList;//�ǹ� ���
	void buyBuilding() {}
}

public class Inherit1OverView {
	public static void main(String[] args) {
		ParkCH pch = new ParkCH();
		pch.ballSpeed = 150;
		System.out.println(pch.ballSpeed);
		System.out.println(pch.pitch());
	}

}
