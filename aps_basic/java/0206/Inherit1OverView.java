/*
 * Inhritance : 상속.
 * - 다른 class의 유전적 형질(변수와 메소드)을, 상속 관계를 통해서, 가져올 수 있다.
 * - extends 키워드를 통해 상속 관계를 정의.
 * 예) ParkCH extends Tusu
 *     - 박찬호 class가 투수 class의 변수와 메소드를 상속 받았다.
 *     - 박찬호 class가 투수 class를 확장했다.
 * - 상속을 주는 class : super, parent, 상위 class.
 * - 상속을 받는 class : sub, child, 하위 class.
 * - 부모 class는 자식 class들이 갖는 공통된 부분을 구현. : generalize
 * - 자식 class는 자식만의 고유한 부분을 가짐. : specialize
 * - class diagram : 자식 -▷ 부모 (실선+속이빈삼각형)
 * - 상속 관계는 is a relation. : 자식은 부모의 한 종류이다.
 * 예) 박찬호 extends 투수, 류현진 extends 투수
 *     - 박찬호는 투수의 한 종류이다. - O
 *       류현진은 투수의 한 종류이다. - O
 *       나쁜 예) 박찬호는 류현진의 한 종류이다. - X
 *              투수는 박찬호의 한 종류이다. - X
 *     - sub class is a super class. - O
 *     - super class is a sub class. - X
 *     - sub class is a sub class. - X
 * - 자바의 상속은 단일 상속.
 * 예) A extends B. - O
 * 나쁜 예) A extends B, C. - X
 * 예) B extends C.
 *     A extends B.
 */
/*
 * 상속을 사용하는 이유.
 * - 구조가 간단 해진다.
 * - 코드 재사용성을 높인다.
 * - 수정과 추가 개발이 용이 해진다.
 * - 프로그램의 확장과 유지보수가 쉬워지는 장점.
 */
class Tusu {
	double ballSpeed;//구속 : 공의 속도
	String pitch() {//공을 던진다.
		return "strike";
	}
}
class ParkCH extends Tusu {
	String [] buildingList;//건물 목록
	void buyBuilding() {}
}
class RyuHJ extends Tusu {
	String [] buildingList;//건물 목록
	void buyBuilding() {}
}

public class Inherit1OverView {
	public static void main(String[] args) {
		ParkCH pch = new ParkCH();
		pch.ballSpeed = 150;
		System.out.println(pch.ballSpeed);
		System.out.println(pch.pitch());
	}

}
