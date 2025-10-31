/*
 * Encapsulation : 은형성. : 숨기자.
 * 1. Data Hiding
 * - 변수에 직접 접근을 막는다.
 * - 변수에 접근 가능한 접근 통로를 만든다.(set/get 메소드)
 * 2. Method Inner Hiding
 * - 메소드 내부 구현을 알지 못해도, return type, parameter lists만 알면,
 *   해당 메소드를 사용할 수 있다.
 * 예) int plus(int a, int b) : int 2개를 넣어서 합쳐진 int를 받는다.
 * return type, parameter lists : 접근 통로 역할.
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
