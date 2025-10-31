
public class Inherit6Argument {

	public static void main(String[] args) {
		Doctor d = new Doctor("강호동","12-12","010-1111-2222","내과","순환기");
		Nurse n = new Nurse("딘딘","98-12","010-9999-8888","간호과","순환기내과");
		Inherit6Argument i6 = new Inherit6Argument();
		i6.printDoctor(d);
		//i6.printDoctor(n);//error
		i6.printPerson(d);
		i6.printPerson(n);
	}
	public void printDoctor(Doctor d) {
		d.print();
	}
	public void printPerson(Person p) {//Polymorphic Arguments
		p.print();
	}

}
