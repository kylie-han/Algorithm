/*
 * Object Oriented Programming Language 3대 특성.
 * 1. Inheritance : 상속.
 * 2. Polymorphism : 다형성.
 * 3. Encapsulation : 은형성(숨기기).
 */
/*
 * Encapsulation
 * 1. Data Hiding : 부정입력 방지.
 * - set/get 메소드가 접근 통로 역할을 하면서, 잘못된 데이터를 걸러준다.
 * 2. Method Inner Hiding
 * - 메소드 내부를 알지 못해도, return type과 parameter lists만 알면,
 *   해당 메소드를 사용하는 것에 문제가 없다.
 * 예) int plus(int a, int b);
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
