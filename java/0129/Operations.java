/*
 * 1. 모든 프로그램 코드는 class의 {} 안에 존재해야 한다.
 * 2. 예외) import, package.
 * 3. class {}의 내부에는 오직 변수 선언과 메소드 선언만이 온다.
 * 4. class 내부의 변수는 data 요소를 의미함. member variable.
 * 5. class 내부의 메소드는 기능적(행위) 요소를 의미함. member method.
 * 6. class를 사용하고 싶으면, new를 통해 메모리 load해야 함.
 */
//package : .java 파일과 .class 파일의 폴더 상의 위치를 지정.
//import : 현재 파일에서 사용하는 class를 가져올 폴더 상의 위치를 지정.
import java.util.Scanner;

class OnlyVarClass {
	int i = 777;
	String s = "only variable";
}

class OnlyMethodClass {
	public int plus() {
		return 7+8;
	}
}
/*
 * 1. overload : 중복 정의 : 하나의 class 내부에,
 * parameter를 달리하는, 같은 이름의 메소드를 여러 개 정의.
 * 2. override : 다시 정의 : 상속관계에서,
 * 부모가 정의한 메소드를 자식이 다시 정의.
 */
public class Operations {
	//parameter, argument : 기능 수행을 위해서 받아야 하는 외부 값.
	//return type : 기능 수행의 결과 받아오는 값의 형태.
	public void simburum1() {//no return, no parameter list
	}
	public void taxiRide(int money) {//no return
	}
	public int buyDrink(int money) {
		return 500;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OnlyVarClass o1 = new OnlyVarClass();
		System.out.println(o1.s);
	}

}






