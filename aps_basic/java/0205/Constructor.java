/*
 * constructor : 생성자
 * - 특수한 형태의 메소드.
 * - return type 없음.
 * - 이름이 class name과 반드시 동일함.
 * - parameter lists 있음.
 * - 프로그램 수행 코드{}를 가짐.
 * - instance가 생성될 때, 최초 1회 수행하는 코드를 삽입하는 곳.
 * - instance 내부의 변수를 초기화하거나, instance에게 data를 전달하는 경우에 사용.
 * - constructor도 overload 됨.
 */
/*
 * default constructor
 * - 형태 : public ClassName(){}
 * - class 내부에 constructor가 하나도 없으면, JVM이 자동 제공.
 * - class 내부에 constructor가 하나라도 있으면, JVM은 제공 안함.
 * - 생성자를 정의할 때는 default 형태의 constructor를 반드시 추가로 정의해야 함.
 */
public class Constructor {
	int testi = 777;
	public Constructor() {}
	public Constructor(int i) {//생성자 overload
		testi = i;
	}
	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println("con : "+con.testi);
		Constructor con2 = new Constructor(999);
		System.out.println("con2 : "+con2.testi);
	}

}
