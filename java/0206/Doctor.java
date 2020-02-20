
public class Doctor extends Person {
	String subject;
	public Doctor(){}
	public Doctor(String name, String ssn, String hp, String dept, String subject){
		super(name, ssn, hp, dept);
		//부모의 생성자를 호출하는 표현.//반드시 생성자 내부의 첫 번째 줄에 있어야 함.
		this.subject = subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.print();//부모의 메소드를 호출.
		System.out.println("전공 : " + subject);
	}
}
