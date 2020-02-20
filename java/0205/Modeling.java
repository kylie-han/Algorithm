/*
 * computer programming : abstraction 과정을 거침.
 * - abstraction : 현실세계를 com의 세계로 필요한 부분만 추출(모델링)하는 과정.
 * 예) 지도의 등고선, 지하철 노선도, 학사 관리의 사람(학생), 병원 관리의 사람(환자)
 * 
 * 개념 모델링 -> 논리 모델링 -> 물리 모델링 : 현실세계를 com의 세계로 인식시키는 과정
 * 개념 모델링
 * - 프로그래밍 대상(Object)에 대한 개념을 모으는 과정
 * - Object Oriented Programming : 대상(Object)을 정의하는 프로그래밍(자바에서는 class)
 * 예) 사람이 아파서 병원에 가면 환자라고 한다. 환자는 상태 진단을 위해 채혈을 한다.
 *     환자는 채혈을 통해 당수치, 간수치, 콜레스테롤 수치를 알수 있다.
 * 논리 모델링
 * - 개념 모델링 결과에서 명사(속성), 동사(기능)을 추출하여, 대상(Object)을 정의하는 것.
 * 예) 환자, 채혈, 당수치, 간수치
 * 물리 모델링
 * - 논리 모델링 결과를 컴퓨터에 반영 가능한 형태로 변환하는 것.(DB는 table로. java는 class로.)
 * 예) class Patient { double sugarLevel, double liverSomaticIndex, testBlood(){} }
 * 
 * OOP : Object Oriented Programming.
 * - 대상(Object)을 정의하는 프로그래밍(자바에서는 class)
 * 나쁜 예) 엄마가 리니를 씻긴다. 엄마가 유니를 씻긴다.
 * 예) 엄마 -> 리니 (-> : 씻는다)
 *        -> 유니
 */
public class Modeling {

	public static void main(String[] args) {
		System.out.println("DESC.....");
	}

}
