
public class Nurse extends Person {
	String charge;
	public Nurse(){}
	public Nurse(String name, String ssn, String hp, String dept, String charge){
		super(name, ssn, hp, dept);
		//부모의 생성자를 호출하는 표현.//반드시 생성자 내부의 첫 번째 줄에 있어야 함.
		this.charge = charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public void print() {
		super.print();//부모의 메소드를 호출.
		System.out.println("담당 : " + charge);
	}
}
