/*
 * Encapsulation : ������. : ������.
 * 1. Data Hiding
 * - ������ ���� ������ ���´�.
 * - ������ ���� ������ ���� ��θ� �����.(set/get �޼ҵ�)
 * 2. Method Inner Hiding
 * - �޼ҵ� ���� ������ ���� ���ص�, return type, parameter lists�� �˸�,
 *   �ش� �޼ҵ带 ����� �� �ִ�.
 * ��) int plus(int a, int b) : int 2���� �־ ������ int�� �޴´�.
 * return type, parameter lists : ���� ��� ����.
 */
class DataHideStudent {
	private String hakbun;
	private int age;
	public String getHakbun() {
		if(hakbun == null) {
			return "wrong data!";
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
		if(age<0) {
			System.out.println("wrong input!");
			return;
		}
		this.age = age;
	}
}
public class EncapsulationOverView {
	public static void main(String[] args) {
		DataHideStudent stu = new DataHideStudent();
		stu.setAge(-17);
		System.out.println(stu.getAge());
		System.out.println(stu.getHakbun());
	}
}
