
public class Nurse extends Person {
	String charge;
	public Nurse(){}
	public Nurse(String name, String ssn, String hp, String dept, String charge){
		super(name, ssn, hp, dept);
		//�θ��� �����ڸ� ȣ���ϴ� ǥ��.//�ݵ�� ������ ������ ù ��° �ٿ� �־�� ��.
		this.charge = charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public void print() {
		super.print();//�θ��� �޼ҵ带 ȣ��.
		System.out.println("��� : " + charge);
	}
}
