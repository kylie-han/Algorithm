
public class Person {
	String name;
	String ssn;
	String hp;
	String dept;
	public Person() {}
	public Person(String name, String ssn, String hp, String dept) {
		this.name = name;
		this.ssn = ssn;
		this.hp = hp;
		this.dept = dept;
	}
	public void print() {
		System.out.print("�̸� : " + name + "\t"
				+"�ֹ� : " + ssn + "\t"
				+"���� : " + hp + "\t"
				+"�μ� : " + dept + "\t");
	}
}
