/*
 * Object Oriented Programming Language 3�� Ư��.
 * 1. Inheritance : ���.
 * 2. Polymorphism : ������.
 * 3. Encapsulation : ������(�����).
 */
/*
 * Encapsulation
 * 1. Data Hiding : �����Է� ����.
 * - set/get �޼ҵ尡 ���� ��� ������ �ϸ鼭, �߸��� �����͸� �ɷ��ش�.
 * 2. Method Inner Hiding
 * - �޼ҵ� ���θ� ���� ���ص�, return type�� parameter lists�� �˸�,
 *   �ش� �޼ҵ带 ����ϴ� �Ϳ� ������ ����.
 * ��) int plus(int a, int b);
 *    double plus(double a, double b);
 */
public class EncapsulationOverView {
	private String hakbun;
	private int age;
	public String getHakbun() {
		if(hakbun == null) {
			return "wrong data !!!";
		}
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("wrong data !!!");
			return;
		}
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
