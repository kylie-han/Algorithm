/*
 * Interface 만들기.
 * - 1.기능을 리스팅한 명세서를 interface로 만든다.
 * - 2.interface를 implements한 class의 이름을 interface명+Impl로 만듬.
 * - interface를 skeleton(뼈대), interface 구현 class를 Impl(구현체)라고 부름.
 */
interface CarInterface {//interface(기능 명세)를 먼저 만든다.
	public void 정지패달();
	public void 가속패달();
	public void 기어변경();
}
class CarInterfaceImpl implements CarInterface {
	@Override
	public void 정지패달() {
	}
	@Override
	public void 가속패달() {
	}
	@Override
	public void 기어변경() {
	}
}
public class Interface5How {

	public static void main(String[] args) {

	}

}
