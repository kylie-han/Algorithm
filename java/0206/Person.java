
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
		System.out.print("이름 : " + name + "\t"
				+"주번 : " + ssn + "\t"
				+"전번 : " + hp + "\t"
				+"부서 : " + dept + "\t");
	}
}
