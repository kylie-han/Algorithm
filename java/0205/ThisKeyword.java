/*
 * this : ���� ��ü, �ڱ� �ڽ��� ��ȯ��.
 * - ���� : �ڱ� ��ü�� ��� ������ ����. this.������.
 * - �޼ҵ� : �ڱ� ��ü�� ��� �޼ҵ忡 ����. this.�޼ҵ��().
 * - ������ : ������ �ȿ��� ������� ��, �ڱ� ��ü�� �ٸ� �����ڸ� ȣ��.
 */
class ThisTest {
	int memVar = 777;
	public void setMemberVar(int memVar) {
		this.memVar = memVar;
	}
	public void local() {
		int memVar = 111;
		System.out.println(memVar);
		System.out.println(this.memVar);//���� ��ü�� ��� ���� ȣ��.
		this.local2();//���� ��ü�� ��� �޼ҵ� ȣ��.
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
