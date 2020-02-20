/*
 * this : 현재 객체, 자기 자신을 반환함.
 * - 변수 : 자기 객체의 멤버 변수에 접근. this.변수명.
 * - 메소드 : 자기 객체의 멤버 메소드에 접근. this.메소드명().
 * - 생성자 : 생성자 안에서 사용했을 때, 자기 객체의 다른 생성자를 호출.
 */
class ThisTest {
	int memVar = 777;
	public void setMemberVar(int memVar) {
		this.memVar = memVar;
	}
	public void local() {
		int memVar = 111;
		System.out.println(memVar);
		System.out.println(this.memVar);//현재 객체의 멤버 변수 호출.
		this.local2();//현재 객체의 멤버 메소드 호출.
	}
	public void local2() {
		System.out.println("this is local2...");
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.local();
	}
}
