import java.util.ArrayList;

/*
 * Polymorphism 한계와 Object type Casting.
 * Polymorphism 한계 : 부모 clss 타입의 변수는 자식 clss 타입의 instance 고유 영역에는 접근 불가.
 * 
 * Object type Casting : Polymorphism 한계 극복 방법.
 * - 명시적 Casting : 부모 class 타입의 변수에 담겨 있는 주소를 자식 class 타입의 변수에 담을 때.
 * - 묵시적 Casting : 자동 Casting. : 자식 객체 주소를 부모 class 타입의 변수에 담을 때.
 */
public class Inherit7PolyLimitCasting {

	public static void main(String[] args) {
		Person [] pArr = new Person[3];//Heterogeneous Collection
		pArr[0] = new Doctor("강호동","12-12","010-1111-2222","내과","순환기");
		//묵시적 Casting
		pArr[1] = new Nurse("딘딘","98-12","010-9999-8888","간호과","순환기내과");
		pArr[2] = new Doctor("유재석","98-75","010-5555-3333","외과","흉부");
		//System.out.println(pArr[0].subject);//error
		//Polymorphism 한계 : 부모 clss 타입의 변수는 자식 clss 타입의 instance 고유 영역에는 접근 불가.
		System.out.println(((Doctor)pArr[0]).subject);//명시적 Casting 예 1)
		Doctor d1 = (Doctor)pArr[0];//명시적 Casting 예 2)
		System.out.println(d1.subject);
		//Polymorphism 한계 극복 : 명시적인 Object data type Casting 사용.
		//??? - 다형성 왜 하나요?
		ArrayList list = new ArrayList();
		list.add(new Doctor("강호동","12-12","010-1111-2222","내과","순환기"));
		list.add(new Nurse("딘딘","98-12","010-9999-8888","간호과","순환기내과"));
		//ArrayList - Heterogeneous Collection
		System.out.println(((Doctor)list.get(0)).subject);//명시적 Casting 예 1)
		Doctor d2 = (Doctor) list.get(0);//명시적 Casting 예 2)
		//다형성의 이점이 한계보다 훨씬 크더라!!!
	}

}






