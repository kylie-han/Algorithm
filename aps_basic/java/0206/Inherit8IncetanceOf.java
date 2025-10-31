/*
 * instanceof
 * - 실제 객체의 Type을 검사해 주는 연산자
 * - true/false만 리턴함.
 */
public class Inherit8IncetanceOf {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("강호동","12-12","010-1111-2222","내과","순환기");
		pArr[1] = new Nurse("딘딘","98-12","010-9999-8888","간호과","순환기내과");
		pArr[2] = new Doctor("유재석","98-75","010-5555-3333","외과","흉부");
		callPrint(pArr[0]);
		callPrint(pArr[1]);
		callPrint(pArr[2]);
	}
	public static void callPrint(Person p) {//Polymorphic Arguments
		if(p instanceof Doctor) {//instanceof 연산자.
			Doctor d = (Doctor) p;
			d.setSubject("외과");
		} else if (p instanceof Nurse) {
			Nurse n = (Nurse) p;
			n.setCharge("응급실");
		}//실제 객체의 Type을 검사해 주는 연산자
		p.print();
	}

}
