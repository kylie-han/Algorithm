/*
 * implements : 구현하다.
 * 예) InterfaceSort implements Comparable : InterfaceSort가 Comparable를 구현했다.
 * - 단일 상속의 약점 극복.
 *   예) class AAA extends BBB implements CCC, DDD, EEE.....
 * - 상속 관계를 만들어서, 다형성 적용이 가능하도록 만들어 준다.
 * - 연관성이 없는 class들에게 연관성을 부여.
 */
interface CCC {}
interface DDD {}
class BBB {}
class AAA extends BBB implements CCC, DDD {}

interface EEE extends CCC, DDD {}
//interface FFF implements CCC, DDD {}//error
/*
 * interface 간에는 extends를 통한 다중 상속 가능.
 * 다중 상속 가능 이유 : static 상수와 abstrac 메소드 로만 이루어져 있기 때문. -> 다중 상속의 모호성 없음.
 */
public class Interface3Impl {
	public static void main(String[] args) {
	}
}
