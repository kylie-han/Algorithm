/*
 * method : class의 행위(동작) 요소.
 * - 수행할 작업의 내용과 순서를 가짐.
 * - 여러 사람의 공동 작업에서는 내가 만들지 않은 메소드를 사용할 수도 있음.
 * - 다른 사람이 만든 메소드를 사용하기 위해서, 메소드 내부의 구현까지 알 필요는 없음.
 * - access modifier, return type, method name, parameter(arguments) lists
 * - access modifier : class/변수/메소드의 접근 가능 여부.
 * - method name : 어떤 기능을 하는 메소드인가를 보여주는 역할. (기능을 알 수 있게 이름을 지어라.)
 * - parameter(arguments) lists : 메소드 수행을 위해서, 받아들여야 하는 데이터의 종류와 갯수.
 * - return type : 메소드의 수행 결과 가져갈 수 있을 것으로 기대되는 값의 형태.
 * - method overload : 메소드의 identity는 name + parameter(arguments) lists.
 */
/*
 * 메소드 선언의 장점
 * - 코드 중복 회피.
 * - 재 사용성 향상.
 * - 개발 기간 단축.
 * - 쉽고 빠른 유지보수.
 */
public class Method2Declare {
	public int plus(int a, int b) { return a+b; }
	public double plus(double a, double b) { return a+b; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
