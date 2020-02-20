/*
 * 메소드의 흐름과 호출.
 * caller method : 다른 메소드를 호출하는 역할.(상대적 개념)
 * worker method : 다른 메소드에 의해 호출되면 동작하는 메소드.(상대적 개념)
 */
public class Method1Call {
	public static void main(String[] args) {//main thread
		Method1Call call = new Method1Call();
		System.out.println("main start");
		call.process1();
		System.out.println("..........main");
		call.process2();
		System.out.println("main end");
	}
	public void process1() {
		System.out.println("1111111111 start");
		process3();
		System.out.println("1111111111 end");
	}
	public void process2() {
		System.out.println("2222222222 start");
		System.out.println("2222222222 end");
	}
	public void process3() {
		System.out.println("3333333333 start");
		System.out.println("3333333333 end");
	}

}
