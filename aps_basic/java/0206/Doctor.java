
public class Doctor extends Person {
	String subject;
	public Doctor(){}
	public Doctor(String name, String ssn, String hp, String dept, String subject){
		super(name, ssn, hp, dept);
		//�θ��� �����ڸ� ȣ���ϴ� ǥ��.//�ݵ�� ������ ������ ù ��° �ٿ� �־�� ��.
		this.subject = subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.print();//�θ��� �޼ҵ带 ȣ��.
		System.out.println("���� : " + subject);
	}
}
