/*
 * 1. ��� ���α׷� �ڵ�� class�� {} �ȿ� �����ؾ� �Ѵ�.
 * 2. ����) import, package.
 * 3. class {}�� ���ο��� ���� ���� ����� �޼ҵ� ������ �´�.
 * 4. class ������ ������ data ��Ҹ� �ǹ���. member variable.
 * 5. class ������ �޼ҵ�� �����(����) ��Ҹ� �ǹ���. member method.
 * 6. class�� ����ϰ� ������, new�� ���� �޸� load�ؾ� ��.
 */
//package : .java ���ϰ� .class ������ ���� ���� ��ġ�� ����.
//import : ���� ���Ͽ��� ����ϴ� class�� ������ ���� ���� ��ġ�� ����.
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
 * 1. overload : �ߺ� ���� : �ϳ��� class ���ο�,
 * parameter�� �޸��ϴ�, ���� �̸��� �޼ҵ带 ���� �� ����.
 * 2. override : �ٽ� ���� : ��Ӱ��迡��,
 * �θ� ������ �޼ҵ带 �ڽ��� �ٽ� ����.
 */
public class Operations {
	//parameter, argument : ��� ������ ���ؼ� �޾ƾ� �ϴ� �ܺ� ��.
	//return type : ��� ������ ��� �޾ƿ��� ���� ����.
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






