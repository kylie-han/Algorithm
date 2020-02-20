/*
 * interface도 implements를 통한 상속 관계 구현 가능.
 * - 연관성이 없는 class들에게 연관성을 부여.
 * - 상속 관계를 만들어서, 다형성 적용이 가능하도록 만들어 준다.
 * - Heterogeneous Collection, Polymorphic Arguments 사용 가능.
 */
class 포유류 {}
class 파충류 {}
class 사람 extends 포유류 implements FunctionWalk {
	@Override
	public void walk() {}
}
class 도마뱀 extends 파충류 implements FunctionWalk {
	@Override
	public void walk() {}
}
interface FunctionWalk {
	public void walk();
}
public class Interface4Poly {
	public static void main(String[] args) {
		포유류 [] parr = new 포유류[2];
		parr[0] = new 사람();
		//parr[1] = new 도마뱀();//error - data type 다름.
		FunctionWalk [] farr = new FunctionWalk[2];
		farr[0] = new 사람();
		farr[1] = new 도마뱀();//Heterogeneous Collection - 다른 data type을 저장 가능한 자료 구조.
	}

}
