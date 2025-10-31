/*
 * has a relationship.
 * - 다른 객체를 attribute(변수)로 소유할 수 있다.
 * 예) Car has a Engine.
 * - class diagram : 엔진 -<> 자동차(실선+속이빈다이아몬드), 포함관계.
 */
//상속 구현의 예시.
class ExamplePerson {
	String name;
	String phone;
	String addrress;
}
class ExampleStudent extends ExamplePerson {
	String hakbun;
	int classRoomNo;//소속
	public void exampleHasARelation() {
		//성적의 표현 - 수업과목{"국","영","수"} - 성적{100,90,80}
		Jumsu [] jumsuArr = new Jumsu[20];//has a relationship
		jumsuArr[0] = new Jumsu("국",100.0,"수");
	}
}
class Jumsu {
	String subjectName;//과목명
	double jumsu;//점수
	String gradeName;//수우미양가
	public Jumsu (String sNm, double p, String gN){
		subjectName = sNm;
		jumsu = p;
		gradeName = gN;
	}
}
class ExampleTeacher extends ExamplePerson {
	String subject;//담당
	int classRoomNo;//담당
}
class ExampleEmployee extends ExamplePerson {
	String empNo;
	String deptName;//소속
}
public class Inherit2Example {

	public static void main(String[] args) {
		System.out.println("상속 구현의 예시");
	}

}
