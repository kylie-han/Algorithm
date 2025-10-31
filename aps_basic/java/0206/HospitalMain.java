
public class HospitalMain {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("강호동","12-12","010-1111-2222","내과","순환기");
		pArr[1] = new Nurse("딘딘","98-12","010-9999-8888","간호과","순환기내과");
		pArr[2] = new Doctor("유재석","98-75","010-5555-3333","외과","흉부");
		for(int i=0; i<pArr.length; i++){
			pArr[i].print();//override를 통한 메소드 호출.
			//override 장점 : 부모 class 타입의 메소드명으로,
			//				자식 class 타입 instance의 메소드를 불러 올 수 있다.
		}
	}

}
