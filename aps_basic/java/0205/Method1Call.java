/*
 * �޼ҵ��� �帧�� ȣ��.
 * caller method : �ٸ� �޼ҵ带 ȣ���ϴ� ����.(����� ����)
 * worker method : �ٸ� �޼ҵ忡 ���� ȣ��Ǹ� �����ϴ� �޼ҵ�.(����� ����)
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
